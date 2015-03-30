package td;

import java.io.*;

class Saisie{
	public static void main(String[] args) {
		BufferedReader br=null;
		String chaine;
		Lexique lex = new Lexique();
		try {
			try {
				br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("saisie : ");
				chaine=br.readLine();
				lex.find_lemmes(chaine);
				System.out.println("j'ai saisi "+chaine);
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
