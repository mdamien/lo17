import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

//taken from http://rosettacode.org/wiki/Levenshtein_distance#Java
public class Levenshtein {
	public static char NULL = '\u0000';

	public static int cout(char x, int i, char y, int j) {
		if (x == NULL) { // insertion
			return 1;
		}
		if (y == NULL) { // suppression
			return 1;
		}
		if (x != y) { // substitution
			return 1;
		}
		return 0;
	}

	public static int distance_with_inversions(String a, String b) {
		// http://en.wikipedia.org/wiki/Wagner%E2%80%93Fischer_algorithm
		// better:
		// http://en.wikipedia.org/wiki/Damerau%E2%80%93Levenshtein_distance
		int min = distance(a, b);
		for (int i = 0; i < a.length() - 1; i++) {
			String s = a.substring(0, i) + a.substring(i + 1, i + 2)
					+ a.substring(i, i + 1) + a.substring(i + 2);
			int d = distance(s, b);
			System.out.println(s + "  - " + d);
		}
		return 0;
	}

	public static int distance(String a, String b) {
		int[][] dist = new int[a.length() + 1][b.length() + 1];
		char X, Y;
		int d1, d2, d3;

		for (int i = 1; i <= a.length(); i++) {
			X = a.charAt(i - 1);
			dist[i][0] = dist[i - 1][0] + cout(X, i, NULL, 0);
		}
		for (int j = 1; j <= b.length(); j++) {
			Y = b.charAt(j - 1);
			dist[0][j] = dist[0][j - 1] + cout(NULL, 0, Y, j);
		}
		for (int i = 1; i <= a.length(); i++) {
			X = a.charAt(i - 1);
			for (int j = 1; j <= b.length(); j++) {
				Y = b.charAt(j - 1);
				d1 = dist[i - 1][j - 1] + cout(X, i, Y, j);
				d2 = dist[i - 1][j] + cout(X, i, NULL, j);
				d3 = dist[i][j - 1] + cout(NULL, i, Y, j);
				dist[i][j] = Math.min(d1, Math.min(d2,d3));
			}
		}
		return dist[a.length()][b.length()];
	}

	public static ArrayList<Match> best_matches(String word,
			Collection<String> dict, int max_distance) {
		ArrayList<Match> matches = new ArrayList<Match>();
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
		System.out.println(distance("ilste", "liste"));
		System.out.println(distance("ilste", "juste"));
		System.out.println(distance_with_inversions("ilste", "liste"));
	}

}
