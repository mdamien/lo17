import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
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
		br = new BufferedReader(new FileReader("divers/fil.txt"));
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
				 * // Algorithme du cours exploitant la recherche par préfixe
				 * (cf. // cours page 33) Hashtable<String, Float> proximityHash
				 * = new Hashtable<String, Float>(); Iterator<String> jtr =
				 * words.values().iterator(); while (jtr.hasNext()) { String
				 * curr = jtr.next(); proximityHash.put(curr, prox(chaine,
				 * curr)); } Enumeration<String> e = proximityHash.keys(); float
				 * seuil = 60; while (e.hasMoreElements()) { String curr =
				 * e.nextElement(); if (proximityHash.get(curr) > seuil) {
				 * lemmes.add(curr); } } // Levenshtein int max_distance =
				 * chaine.length() > 3 ? chaine.length() / 3 : 3;
				 * ArrayList<Match> matches = Levenshtein.best_matches(chaine,
				 * words.keySet(), max_distance); int c = 0; for (Match match :
				 * matches) { if (!lemmes.contains(match.word)) {
				 * lemmes.add(words.get(match.word)); c += 1; if (c > 3) {
				 * break; } } }
				 */
		}
		return lemmes;
	}
}