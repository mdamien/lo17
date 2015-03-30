package td;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

import td.Levenshtein.Match;

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

	public ArrayList<String> find_lemmes(String chaine) {
		ArrayList<String> lemmes = new ArrayList<String>();
		chaine = chaine.toLowerCase();
		if(words.containsKey(chaine)){
			lemmes.add(words.get(chaine));
		}
		//TODO test nb lettres communes
		else{
			ArrayList<Match> matches = Levenshtein.best_matches(chaine, words.keySet(), 1);
			for (Match match : matches) {
				if(!lemmes.contains(match.word)){
					lemmes.add(words.get(match.word));
					if(lemmes.size() > 3){
						break;
					}
				}
			}
		}
		return lemmes;
	}

}
