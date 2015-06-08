public class Match {
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