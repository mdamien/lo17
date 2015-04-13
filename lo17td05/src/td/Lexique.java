package td;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Stack;
import java.util.StringTokenizer;

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

	/**
	 * Compare la distance entre deux mots en selon l'algorithme de recherche
	 * par préfixe (cf. cours page 33)
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
		int aLength = a.length();
		int bLength = b.length();
		if ((aLength > seuilMin) ||(bLength > seuilMin)){
			result = 0;
		}
		return result;
	}

	public ArrayList<String> find_lemmes(String chaine) {
		ArrayList<String> lemmes = new ArrayList<String>();
		chaine = chaine.toLowerCase();
		if (words.containsKey(chaine)) {
			lemmes.add(words.get(chaine));
		} else {
			// TODO Lettres communes, algorithme du cours exploitant les
			// préfixes à coder ici
			Hashtable<String, Float> commonLettersHash = new Hashtable<String, Float>();
			Iterator<String> jtr = words.values().iterator();
			while (jtr.hasNext()) {
				String curr = jtr.next();
				commonLettersHash.put(curr, prox(chaine, curr));
			}
			Enumeration<String> e = commonLettersHash.keys();
			while (e.hasMoreElements()) {
				e.nextElement();
			}
			// TODO Levenshtein
			ArrayList<Match> matches = Levenshtein.best_matches(chaine,
					words.keySet(), 1);
			for (Match match : matches) {
				if (!lemmes.contains(match.word)) {
					lemmes.add(words.get(match.word));
					if (lemmes.size() > 3) {
						break;
					}
				}
			}
		}
		return lemmes;
	}
}
