import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

public class Main {
	public static String to_sql(String s) throws Exception {
		try {
			tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(
					new StringReader(s)));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// tal_sqlParser parser = new tal_sqlParser(tokens);
			tal_sqlParser parser = new MyParser(tokens);
			String arbre = parser.listerequetes();
			System.out.println("syntax errrors:"
					+ parser.getNumberOfSyntaxErrors());
			String retour = arbre + ";";
//			Pattern pat = Pattern.compile("(\\(|\\))");
//			Matcher mat = pat.matcher(retour);
//			return mat.replaceAll("");
			return retour;
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

	private static void preparingForSql(String s) {
		String[] ssplit = s.split("(\\s)+");
		// if (ssplit[0] != "VOULOIR" || ssplit[0] != " VOULOIR") {
		// }
		for (String sub : ssplit) {
			sub.replaceAll("[^A-Z]", "");
			System.out.println("###" + sub + "###");
		}
	}

	public static String handle(String query) throws Exception {
		System.out.println("Input: " + query);

		// normalize
		query = query.trim().toLowerCase();
		// remove trailing dots
		query = query.replaceAll("(\\.)$", "") + ".";
		System.out.println("Handle: " + query);

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

		// ajouter VOULOIR, MOT,...

		// parse it
		if (!query.endsWith(".")) {
			query += " .";
		}
		System.out.println("Transformed:" + query);

		// ajouter VOULOIR, MOT,...
		preparingForSql(query);

		// parse it
		System.out.println("Missing keywords added (old sent) : " + query);

		Requete R = new Requete(to_sql(query));
		System.out.println("___" + to_sql(query) + "___");
		R.execute();
		return "Jean-Michel SQL";

		// String sql = to_sql(query);
		// System.out.println("Output: " + sql);
		// return sql;
	}

	public static void main(String[] args) throws Exception {
		String[] tests = {
				"Je veux les articles qui parlent de la « biologie ».",
				"Je veux les articles parlant de l'Argentine ou du Brésil.",
				"Quels sont les articles qui concernent le nucléaire ?",
				"Articles parlant d'université.",
				"Quels sont les articles qui parlent de technologies a3D.",
				"Je veux les articles impliquant le CNRS et qui parlent de chimie." };
		for (String query : tests) {
			handle(query);
		}
	}
}
