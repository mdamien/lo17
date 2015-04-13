import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;

//taken from http://rosettacode.org/wiki/Levenshtein_distance#Java
public class Levenshtein {
	public static class Match{
		public Match(String word, int distance) {
			this.word = word;
			this.distance = distance;
		}
		public String word;
		public int distance;
		@Override
		public String toString() {
			return word+"["+Integer.toString(distance)+"]";
		}
	}
	
    public static float distance(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        // i == 0
        int [] costs = new int [b.length() + 1];
        for (int j = 0; j < costs.length; j++)
            costs[j] = j;
        for (int i = 1; i <= a.length(); i++) {
            // j == 0; nw = lev(i - 1, j)
            costs[0] = i;
            int nw = i - 1;
            for (int j = 1; j <= b.length(); j++) {
                int cj = Math.min(1 + Math.min(costs[j], costs[j - 1]), a.charAt(i - 1) == b.charAt(j - 1) ? nw : nw + 1);
                nw = costs[j];
                costs[j] = cj;
            }
        }
        return costs[b.length()];
    }
    
    public static ArrayList<Match> best_matches(String word, Collection<String> dict, int max_distance){
    	ArrayList<Match> matches = new ArrayList<Match>();
    	int best_h = -1;
    	for (String other_word : dict) {
    		if(!word.equals(other_word)){
    			int d = distance(word, other_word);
    			if(d <= max_distance){
    				matches.add(new Match(other_word, d));
    			}
    		}
		}
    	Collections.sort(matches,new Comparator<Match>() {
    		public int compare(Match m, Match m2) {
    			return m.distance-m2.distance;
    		}
		});
    	
    	return matches;
    }
    
    public static void main(String[] args) {
		System.out.println(distance("panda", "padaaa"));
	}

}
