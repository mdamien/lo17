package td;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.StringTokenizer;

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
		br = new BufferedReader(new FileReader("divers/fil"));
		String chaine;
		while ((chaine = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(chaine);
			ht.put(st.nextToken(), st.nextToken());
		}
		br.close();
		return ht;
	}
	
	public static void main(String[] args) {
		Lexique lex = new Lexique();
		lex.words.put("key", "value");

		Collection c = lex.words.values();
		Iterator itr = c.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public ArrayList<String> find_lemmes(String chaine) {
		ArrayList<String> lemmes = new ArrayList<String>();
		chaine = chaine.toLowerCase();
		if(words.containsKey(chaine)){
			lemmes.add(words.get(chaine));
		}
		//TODO test nb lettres communes
		//TODO test levenshtein
		//
		return lemmes;
	}

}
