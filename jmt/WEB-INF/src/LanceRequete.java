import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.sql.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.StringTokenizer;

@SuppressWarnings("serial")
public class LanceRequete extends HttpServlet {
	public class Lexique {
		public Hashtable<String, String> words;

		public Lexique() {
			try {
				words = initializeHash();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public Hashtable<String, String> initializeHash() throws IOException {
			Hashtable<String, String> ht = new Hashtable<String, String>();
			BufferedReader br = null;
			String chaine;
			try {
				br = new BufferedReader(new FileReader(getServletContext()
						.getRealPath("/divers/fil.txt")));
			} catch (Exception e) {
				e.printStackTrace();
			}
			while ((chaine = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(chaine);
				ht.put(st.nextToken(), st.nextToken());
			}
			br.close();
			return ht;
		}

		/**
		 * Compare la distance entre deux mots en selon l'algorithme de
		 * recherche par préfixe (cf. cours page 33)
		 * 
		 * @author maximool
		 * @param a
		 *            le premier mots
		 * @param b
		 *            le deuxième mot mots
		 * @return la proximité du mot
		 */
		public float prox(String a, String b) {
			float result = -1;
			int seuilMin = 3;
			int seuilMax = 4;
			int aLength = a.length();
			int bLength = b.length();
			if ((aLength < seuilMin) || (bLength < seuilMin)) {
				result = 0;
			} else if (Math.abs(aLength - bLength) > seuilMax) {
				result = 0;
			} else {
				int i = 0;
				char aChars[] = new char[aLength];
				char bChars[] = new char[bLength];
				a.getChars(0, aLength, aChars, 0);
				b.getChars(0, bLength, bChars, 0);
				while ((aChars[i] == bChars[i])
						&& (i < Math.min(aLength, bLength) - 1)) {
					i++;
					result = (i / Math.max(aLength, bLength)) * 100;
				}
			}
			return result;
		}

		public ArrayList<String> find_lemmes(String chaine) {
			ArrayList<String> lemmes = new ArrayList<String>();
			chaine = chaine.toLowerCase();
			if (words.containsKey(chaine)) {
				lemmes.add(words.get(chaine));
			} else {/*
					 * // Algorithme du cours exploitant la recherche par
					 * préfixe (cf. // cours page 33) Hashtable<String, Float>
					 * proximityHash = new Hashtable<String, Float>();
					 * Iterator<String> jtr = words.values().iterator(); while
					 * (jtr.hasNext()) { String curr = jtr.next();
					 * proximityHash.put(curr, prox(chaine, curr)); }
					 * Enumeration<String> e = proximityHash.keys(); float seuil
					 * = 60; while (e.hasMoreElements()) { String curr =
					 * e.nextElement(); if (proximityHash.get(curr) > seuil) {
					 * lemmes.add(curr); } } // Levenshtein int max_distance =
					 * chaine.length() > 3 ? chaine.length() / 3 : 3;
					 * ArrayList<Match> matches =
					 * Levenshtein.best_matches(chaine, words.keySet(),
					 * max_distance); int c = 0; for (Match match : matches) {
					 * if (!lemmes.contains(match.word)) {
					 * lemmes.add(words.get(match.word)); c += 1; if (c > 3) {
					 * break; } } }
					 */
			}
			return lemmes;
		}
	}

	String username = "";
	String password = "";
	String url = "";
	String requete = "";
	String nom = "";
	int nbre = 0;

	//
	public String to_sql(String s) throws Exception {
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

	public String correct(String chaine) {
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

	public String replace(String chaine,
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

	public LinkedHashMap<String, String> keywords() {
		LinkedHashMap<String, String> ht = new LinkedHashMap<String, String>();
		BufferedReader br = null;
		try {
			String chaine;
			try {
				br = new BufferedReader(new FileReader(getServletContext()
						.getRealPath("/divers/keywords.txt")));
			} catch (Exception e) {
				e.printStackTrace();
			}
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

	public LinkedHashMap<String, String> stopwords() {
		LinkedHashMap<String, String> ht = new LinkedHashMap<String, String>();
		BufferedReader br = null;
		try {
			String chaine;
			try {
				br = new BufferedReader(new FileReader(getServletContext()
						.getRealPath("/divers/stopwords.txt")));
			} catch (Exception e) {
				e.printStackTrace();
			}
			while ((chaine = br.readLine()) != null) {
				ht.put(chaine, "");
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ht;
	}

	public String join(List<String> splitted, String sep) {
		StringBuilder builder = new StringBuilder();
		for (String s : splitted) {
			builder.append(s);
			builder.append(sep);
		}
		return builder.toString().trim();
	}

	public List<String> filter_empty(String[] arr) {
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

	private String add_missings_keywords(String s) {
		List<String> splitted = filter_empty(s.split("\\b"));

		System.out.println(join(splitted, "-,-"));
		if (!splitted.get(0).equals("VOULOIR")) {
			splitted.add(0, "VOULOIR");
		}
		return join(splitted, " ");
	}

	public String handle(String query) throws Exception {
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

		System.out.println("To be parsed : " + query);
		String sql = to_sql(query);
		System.out.println("SQL: " + sql);

		return sql;
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/json");
		PrintWriter out = response.getWriter();
		JSONObject resp = new JSONObject();

		username = "lo17xxx";
		password = "dblo17";
		url = "jdbc:postgresql://tuxa.sme.utc/dblo17";

		String rSug = request.getParameter("suggest");
		String requete = request.getParameter("requete");
		
		boolean do_request = true;
		if(rSug != null && rSug.equals("only")){
			do_request = false;
		}
		resp.put("requete", requete);
		resp.put("do_request", do_request);

		if(rSug != null){
			resp.put("suggestions","[bientot les sugggestions ici!]");
		}
		if (requete != null && do_request){
			try {
				requete = handle(requete);
				resp.put("sql", requete);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			try {
				Class.forName("org.postgresql.Driver");
			} catch (java.lang.ClassNotFoundException e) {
				System.err.print("ClassNotFoundException: ");
				System.err.println(e.getMessage());
			}
			try {
				Connection con;
				Statement stmt;
				con = DriverManager.getConnection(url, username, password);
				stmt = con.createStatement();
				
				ResultSet rs = stmt.executeQuery(requete);
				ResultSetMetaData rsmd = rs.getMetaData();
				nbre = rsmd.getColumnCount();
				
				JSONArray arr = new JSONArray();
				
				while (rs.next()) {
					JSONObject obj = new JSONObject();
					for (int i = 1; i <= nbre; i++) {
						String name = rsmd.getColumnName(i);
						obj.put(name, rs.getString(name).trim());
					}
					arr.add(obj);
				}
				System.out.println(arr.toString());
				resp.put("results", arr);
				stmt.close();
				con.close();
			}
			catch (SQLException ex) {
				System.err.println("==> SQLException: ");
				while (ex != null) {
					resp.put("error",ex.getMessage());
					System.out.println("Message:   " + ex.getMessage());
					ex = ex.getNextException();
				}
			}
		}
		out.println(resp.toString());
		out.close();
	}
}