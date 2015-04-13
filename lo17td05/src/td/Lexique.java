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
	 * @param str1
	 *            le premier mots
	 * @param str2
	 *            le deuxième mot mots
	 * @return la proximité du mot
	 */
	public float prox(String str1, String str2) {

		return 0;
	}

	public ArrayList<String> find_lemmes(String chaine) {
		ArrayList<String> lemmes = new ArrayList<String>();
		chaine = chaine.toLowerCase();
		if (words.containsKey(chaine)) {
			lemmes.add(words.get(chaine));
		} else {
			// TODO Lettres communes, algorithme du cours exploitant les
			// préfixes à coder ici
			Stack<String> candidates;// candidats choisis
			Hashtable<String, Integer> commonLettersHash = new Hashtable<String, Integer>();
			Iterator<String> jtr = words.values().iterator();
			while (jtr.hasNext()) {
				String curr = jtr.next();
				commonLettersHash.put(curr, lettersInCommon(chaine, curr));
			}
			int[] max = { 0, 0, 0 };
			for (int tni : commonLettersHash.values()) {
				if (max[0] < tni)
					max[0] = tni;
				if (max[1] < max[0])
					max[1] = max[0];
				if (max[2] < max[1])
					max[2] = max[1];
			}
			Enumeration<String> e = commonLettersHash.keys();
			// for (e.){
			// }

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

	public int lettersInCommon(String a, String b) {
		int charsInCommon = -1;
		char[] aChars = new char[a.length()];
		a.getChars(0, a.length() - 1, aChars, 0);
		for (int i = 0; i < aChars.length; i++) {
			if (b.contains("" + aChars[i])) {
				charsInCommon++;
			}
		}
		return charsInCommon;
	}
}
