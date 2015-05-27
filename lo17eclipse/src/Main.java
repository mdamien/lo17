import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.StringTokenizer;

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
			//System.out.println("syntax errrors:"
			//		+ parser.getNumberOfSyntaxErrors());
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
	
	public static String join(List<String> splitted, String sep){
		StringBuilder builder = new StringBuilder();
		for(String s : splitted) {
		    builder.append(s);
		    builder.append(sep);
		}
		return builder.toString().trim();
	}
	
	public static List<String> filter_empty(String[] arr){
		List<String> out = new ArrayList<String>();
		for(String s : arr) {
			if(s.trim().length() > 0){
				out.add(s);
			}
		}
		return out;
	}

	private static String add_missings_keywords(String s) {
		List<String> splitted = filter_empty(s.split("\\b"));
		
		System.out.println(join(splitted,"-,-"));
		if (splitted.get(0) != "VOULOIR"){
			splitted.set(0, "VOULOIR "+splitted.get(0));
		}
		return join(splitted, " ");
	}

	public static void handle(String query) throws Exception {
		System.out.println("Input: " + query);

		// normalize
		query = query.trim().toLowerCase();
		// remove trailing dots
		query = query.replaceAll("(\\.)$", "") + ".";
		//System.out.println("Handle: " + query);

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
		//System.out.println("Missing keywords added : " + query);
		
		// parse it
		if (!query.endsWith(".")) {
			query += " .";
		}
		
		System.out.println("To be parsed : " + query);
		String sql = to_sql(query);
		System.out.println("SQL: " + sql);
		
		Requete R = new Requete(sql);
		R.execute();
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
			System.out.println("___________________________________________________________________\n");
			handle(query);
		}
	}
}
