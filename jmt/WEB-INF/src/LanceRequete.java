import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.StringTokenizer;

@SuppressWarnings("serial")
public class LanceRequete extends HttpServlet {
	String username = "";
	String password = "";
	String url = "";
	String requete = "";
	String nom = "";
	int nbre = 0;

	//
	public static String to_sql(String s) throws Exception {
		try {
			tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(
					new StringReader(s)));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// tal_sqlParser parser = new tal_sqlParser(tokens);
			tal_sqlParser parser = new MyParser(tokens);
			String arbre = parser.listerequetes();
			// System.out.println("syntax errrors:"
			// + parser.getNumberOfSyntaxErrors());
			return arbre;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	public static String correct(String chaine) {
		Lexique lex = new Lexique();
		String[] chaines = chaine.split("\\b");
		int i = 0;
		ArrayList<String> all_lemmes = new ArrayList<String>();
		String sentence = "";
		for (String word : chaines) {
			if (i % 2 != 0 && word.length() > 2) {
				ArrayList<String> lemmes = lex.find_lemmes(word);
				if (lemmes.size() > 0) {
					sentence += lemmes.get(0);
					all_lemmes.add(lemmes.get(0));
				} else {
					sentence += word;
				}
			} else {
				sentence += word;
			}
			i += 1;
		}
		return sentence;
	}

	public static String replace(String chaine,
			LinkedHashMap<String, String> replacements) {
		String[] chaines = chaine.split("\\b");
		int i = 0;
		String sentence = "";
		chaine = chaine.trim();

		for (String word : chaines) {
			if (i % 2 != 0) {
				if (replacements.containsKey(word)) {
					sentence += replacements.get(word);
				} else {
					sentence += word;
				}
			} else {
				sentence += " ";
			}
			i += 1;
		}
		return sentence;
	}

	public static LinkedHashMap<String, String> keywords() {
		LinkedHashMap<String, String> ht = new LinkedHashMap<String, String>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("divers/keywords.txt"));
			String chaine;
			while ((chaine = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(chaine, "|");
				ht.put(st.nextToken().trim().toLowerCase(), st.nextToken()
						.trim());
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return ht;
	}

	public static LinkedHashMap<String, String> stopwords() {
		LinkedHashMap<String, String> ht = new LinkedHashMap<String, String>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("divers/stopwords.txt"));
			String chaine;
			while ((chaine = br.readLine()) != null) {
				ht.put(chaine, "");
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ht;
	}

	public static String join(List<String> splitted, String sep) {
		StringBuilder builder = new StringBuilder();
		for (String s : splitted) {
			builder.append(s);
			builder.append(sep);
		}
		return builder.toString().trim();
	}

	public static List<String> filter_empty(String[] arr) {
		// DO NOT ADD "CONTIENT" TWO TIMES
		boolean contient_added = false;
		List<String> out = new ArrayList<String>();
		for (String s : arr) {
			if (s.trim().length() > 0) {
				if (s.equals("CONTIENT")) {
					if (contient_added) {
						continue;
					}
					contient_added = true;
				}
				out.add(s);
			}
		}
		return out;
	}

	private static String add_missings_keywords(String s) {
		List<String> splitted = filter_empty(s.split("\\b"));

		System.out.println(join(splitted, "-,-"));
		if (!splitted.get(0).equals("VOULOIR")) {
			splitted.add(0, "VOULOIR");
		}
		return join(splitted, " ");
	}

	public static String handle(String query) throws Exception {
		System.out.println("Input: " + query);

		// normalize
		query = query.trim().toLowerCase();
		// remove trailing dots
		query = query.replaceAll("(\\.)$", "") + ".";
		// System.out.println("Handle: " + query);

		// lemmatisation et correction ortho
		query = correct(query);
		// System.out.println("Corrected: " + query);

		// lemmatiser les mots-clés (vouloir,veux,...)
		LinkedHashMap<String, String> keywords = keywords();
		query = replace(query, keywords);
		// System.out.println("Lemmatised: " + query);

		// remove les stop-words
		LinkedHashMap<String, String> stopwords = stopwords();
		query = replace(query, stopwords).trim();
		// System.out.println("Stop words removed: " + query);

		// add missing keywords
		query = add_missings_keywords(query);
		// System.out.println("Missing keywords added : " + query);

		// parse it
		if (!query.endsWith(".")) {
			query += " .";
		}

		return query;
	}

	//

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Lance requête</title>");
		out.println("</head>");
		out.println("<body>");

		// ---- configure START
		username = "lo17xxx";
		password = "dblo17";
		// The URL that will connect to TECFA's MySQL server
		// Syntax: jdbc:TYPE:machine:port/DB_NAME

		url = "jdbc:postgresql://tuxa.sme.utc/dblo17";

		// dans certaines configurations locales il faut d�finir l'url par :
		// url = "jdbc:postgresql://tuxa.sme.utc";
		// ---- configure END

		String requete;
		requete = request.getParameter("requete");

		if (requete != null) {
			// / Partie d'integration
			try {
				requete = handle(requete);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// /
			// INSTALL/load the Driver (Vendor specific Code)
			try {
				Class.forName("org.postgresql.Driver");
			} catch (java.lang.ClassNotFoundException e) {
				System.err.print("ClassNotFoundException: ");
				System.err.println(e.getMessage());
			}
			try {
				Connection con;
				Statement stmt;
				// Establish Connection to the database at URL with usename and
				// password
				con = DriverManager.getConnection(url, username, password);
				stmt = con.createStatement();
				// Send the query and bind to the result set
				ResultSet rs = stmt.executeQuery(requete);
				ResultSetMetaData rsmd = rs.getMetaData();
				nbre = rsmd.getColumnCount();
				while (rs.next()) {
					for (int i = 1; i <= nbre; i++) {
						nom = rsmd.getColumnName(i);
						String s = rs.getString(nom);
						out.print(s);
					}
					out.print("<p>");
				}
				out.println("</body>");
				out.println("</html>");
				// Close resources
				stmt.close();
				con.close();
			}
			// print out decent erreur messages
			catch (SQLException ex) {
				System.err.println("==> SQLException: ");
				while (ex != null) {
					System.out.println("Message:   " + ex.getMessage());
					System.out.println("SQLState:  " + ex.getSQLState());
					System.out.println("ErrorCode: " + ex.getErrorCode());
					ex = ex.getNextException();
					System.out.println("");
				}
			}
		} else {
			out.println("Requête vide !");
			out.println("</body>");
			out.println("</html>");
		}
	}
}