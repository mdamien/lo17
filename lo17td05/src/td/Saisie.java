package td;

import java.io.*;
import java.util.ArrayList;
import java.util.Set;

class Saisie{
	public static void main(String[] args) {
		BufferedReader br=null;
		String chaine;
		Lexique lex = new Lexique();
		try {
			try {
				br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("saisie : ");
				chaine = br.readLine();
				Set<String> lemmes = lex.find_lemmes(chaine);
				System.out.println("Lemmes de "+chaine+":");
				for (String lemme : lemmes) {
					System.out.println(lemme);
				}
			} 
			catch(EOFException e) {
				br.close();
			}
		} 
		catch(IOException e) {
			System.out.println("IO Exception");
		}
	}
}
