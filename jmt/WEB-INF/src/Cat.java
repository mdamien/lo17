import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Cat {
	public static void main(String[] args) {
		BufferedReader br = null;
		String chaine;
		try {
			try {
				br = new BufferedReader(new FileReader(args[0]));
				while ((chaine = br.readLine()) != null)
					System.out.println(chaine);
			} catch (EOFException e) {
				br.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("fichier inconnu : " + args[0]);
		} catch (IOException e) {
			System.out.println("IO Exception");
		}
	}
}
