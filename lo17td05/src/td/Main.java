package td;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static Hashtable<String, String> initializeHash() throws IOException {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		BufferedReader br = null;
		br = new BufferedReader(new FileReader("divers/fil"));
		String chaine;
		while ((chaine = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(chaine);
			ht.put(st.nextToken(), st.nextToken());
		}
		br.close();
		return ht;
	}

	public static void main(String[] args) throws IOException {
		Hashtable<String, String> lexic = initializeHash();
		lexic.put("key", "value");

		Collection c = lexic.values();
		Iterator itr = c.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}