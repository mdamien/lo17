import java.io.*;
import java.util.Scanner;
//import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

public class TalMain3 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Texte : ");
		String s = scanner.nextLine();
		System.out.println(s);
		while (!s.equals("*")) {
			try {
				// Classes à instancier pour la grammaire Tal_simple
				// Tal_simpleLexer lexer = new Tal_simpleLexer(
				// new ANTLRReaderStream(new StringReader(s)));
				// CommonTokenStream tokens = new CommonTokenStream(lexer);
				// Tal_simpleParser parser = new Tal_simpleParser(tokens);

				tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(
						new StringReader(s)));
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				tal_sqlParser parser = new tal_sqlParser(tokens);
				String arbre = parser.listerequetes();
				System.out.println(arbre);
			} catch (Exception e) {
			}
			System.out.print("Texte : ");
			s = scanner.nextLine();
		}
	}
}
