package td;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

//taken from http://rosettacode.org/wiki/Levenshtein_distance#Java
public class Levenshtein {
	public static char NULL = '\u0000';

	public static int cout(char x, char y) {
		if (x == NULL) { // insertion
			return 1;
		}
		if (y == NULL) { // insertion
			return 1;
		}
		if (x != y) { // substitution
			return 1;
		}
		return 0;
	}

	public static class Match {
		public Match(String word, int distance) {
			this.word = word;
			this.distance = distance;
		}

		public String word;
		public int distance;

		@Override
		public String toString() {
			return word + "[" + Integer.toString(distance) + "]";
		}
	}

	public static int distance(String a, String b) {
		int[][] dist = new int[a.length() + 1][b.length() + 1];
		char X, Y;
		int d1, d2, d3;

		for (int i = 1; i <= a.length(); i++) {
			X = a.charAt(i - 1);
			dist[i][0] = dist[i - 1][0] + cout(X, NULL);
		}
		for (int j = 1; j <= b.length(); j++) {
			Y = b.charAt(j - 1);
			dist[0][j] = dist[0][j - 1] + cout(NULL, Y);
		}
		for (int i = 1; i <= a.length(); i++) {
			X = a.charAt(i - 1);
			for (int j = 1; j <= b.length(); j++) {
				Y = b.charAt(j - 1);
				d1 = dist[i - 1][j - 1] + cout(X, Y);
				d2 = dist[i - 1][j] + cout(X, NULL);
				d3 = dist[i][j - 1] + cout(NULL, Y);

				dist[i][j] = Math.min(d1, Math.min(d2, d3));
			}
		}
		return dist[a.length()][b.length()];
	}

	public static ArrayList<Match> best_matches(String word,
			Collection<String> dict, int max_distance) {
		ArrayList<Match> matches = new ArrayList<Match>();
		int best_h = -1;
		for (String other_word : dict) {
			if (!word.equals(other_word)) {
				int d = (int) distance(word, other_word);
				if (d <= max_distance) {
					matches.add(new Match(other_word, d));
				}
			}
		}
		Collections.sort(matches, new Comparator<Match>() {
			public int compare(Match m, Match m2) {
				return m.distance - m2.distance;
			}
		});

		return matches;
	}

	public static void main(String[] args) {
		System.out.println(distance("panda", "padaaa"));
	}

}
