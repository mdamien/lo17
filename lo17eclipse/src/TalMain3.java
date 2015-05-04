import java.io.*;
import java.util.Scanner;
//import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

public class TalMain3 {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		Scanner scanTest = new Scanner(new File("divers/atester.txt"));
		System.out.print("Texte : ");
		String s = scanner.nextLine();
		System.out.println(s);
		while (!s.equals("*")) {
			try {
				tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(
						new StringReader(s)));
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				tal_sqlParser parser = new tal_sqlParser(tokens);
				String arbre = parser.listerequetes();
				System.out.println(arbre);
			} catch (Exception e) {
			}
			System.out.print("Texte : ");
			// Ligne de test
			s = scanTest.nextLine();
			// s = scanner.nextLine();
		}
		scanTest.close();
		scanner.close();
	}
}