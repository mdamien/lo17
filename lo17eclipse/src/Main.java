import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.StringTokenizer;

import javax.management.Query;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

public class Main {
	
	public static String to_sql(String s) {
		try{
			tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(
					new StringReader(s)));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			tal_sqlParser parser = new tal_sqlParser(tokens);
			String arbre = parser.listerequetes();
			return arbre;
		}catch(IOException e){
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
	
	public static Hashtable<String, String> keywords() {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader("divers/keywords.txt"));
			String chaine;
			while ((chaine = br.readLine()) != null) {
				System.out.println("ch "+chaine);
				StringTokenizer st = new StringTokenizer(chaine, "|");
				ht.put(st.nextToken().trim(), st.nextToken().trim());
			}
		}catch(IOException e){
			e.printStackTrace();
			return null;
		}
		return ht;
	}
	
	public static Hashtable<String, String> stopwords() {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader("divers/stopwords.txt"));
			String chaine;
			while ((chaine = br.readLine()) != null) {
				ht.put(chaine,"");
			}
			br.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		return ht;
	}
	
	public static String handle(String query){
		//normalize
		query = query.trim().toLowerCase();
		System.out.println("Handle: "+query);
		
		//lemmatisation et correction ortho
		query = correct(query);
		System.out.println("Corrected: "+query);
		
		//lemmatiser les mots-clés (vouloir,veux,...)
		Hashtable<String, String> keywords = keywords();
		//TODO replace
		System.out.println("Lemmatised: "+query);
		
		//remove les stop-words
		Hashtable<String, String> stopwords = stopwords();
		//TODO replace
		System.out.println("Stop words removed: "+query);
		
		//parse it
		String sql = to_sql(query+".");
		System.out.println("Result: "+sql);

		return sql;
	}
	
	public static void main(String[] args) throws IOException {
		String query = "Quels sont les articles qui concernent le nucléaire ?";
		handle(query);
	}
}
