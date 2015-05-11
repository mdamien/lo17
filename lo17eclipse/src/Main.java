import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

public class Main {

	public static String to_sql(String s) throws Exception {
		try {
			tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(
					new StringReader(s)));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			tal_sqlParser parser = new tal_sqlParser(tokens);
			String arbre = parser.listerequetes();
			return arbre;
		} catch (IOException e) {
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
		for (String key : replacements.keySet()) {
			chaine = chaine.replaceAll("\\b" + key + "\\b",
					replacements.get(key));
			chaine = chaine
					.replaceAll("$" + key + "\\b", replacements.get(key));
			chaine = chaine
					.replaceAll("\\b" + key + "^", replacements.get(key));
		}
		return chaine;
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

	public static String handle(String query) throws Exception {
		// normalize
		query = query.trim().toLowerCase();
		System.out.println("Handle: " + query);

		// lemmatisation et correction ortho
		query = correct(query);
		System.out.println("Corrected: " + query);

		// lemmatiser les mots-clés (vouloir,veux,...)
		LinkedHashMap<String, String> keywords = keywords();
		query = replace(query, keywords);
		System.out.println("Lemmatised: " + query);

		// remove les stop-words
		LinkedHashMap<String, String> stopwords = stopwords();
		query = replace(query, stopwords).trim();
		System.out.println("Stop words removed: " + query);

		// parse it
		if (!query.endsWith(".")) {
			query = query + ".";
		}
		System.out.println("Sent:" + query);
		String sql = to_sql(query);
		System.out.println("Result: " + sql);

		return sql;
	}

	public static void main(String[] args) throws Exception {
		String[] tests = {
				"Je veux les articles qui parlent de la « biologie ».",
				"Je veux les articles parlant de l'Argentine ou du Brésil.",
				"Quels sont les articles qui concernent le nucléaire ?",
				"Articles parlant d'université.",
				"Quels sont les articles qui parlent de technologies 3D.",
				"Je veux les articles impliquant le CNRS et qui parlent de chimie." };
		for (String query : tests) {
			handle(query);
		}
	}
}
