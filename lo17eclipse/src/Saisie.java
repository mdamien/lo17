import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Saisie {
	public static void main(String[] args) {
		BufferedReader br = null;
		String chaine;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("saisie : ");
			chaine = br.readLine();
			correct(chaine);
		} catch (Exception e) {
			e.printStackTrace();
		}
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
				System.out.println("Lemmes de " + word + ":");
				for (String lemme : lemmes) {
					System.out.println(lemme);
				}
				if (lemmes.size() > 0) {
					sentence += lemmes.get(0);
					all_lemmes.add(lemmes.get(0));
				} else {
					sentence += "[" + word + "]";
				}
			} else {
				sentence += word;
			}
			i += 1;
		}
		return sentence;
	}
}
