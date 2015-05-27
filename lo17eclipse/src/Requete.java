import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Requete {
	String requeque;

	public Requete(String req) {
		requeque = req;
	}

	public void execute() {
		String username;
		String password;
		String url;
		String nom;
		int nbre;
		// ---- configure START
		username = "lo17xxx";
		password = "dblo17";
		// The URL that will connect to TECFA's MySQL server
		// Syntax: jdbc:TYPE:machine:port/DB_NAME
		url = "jdbc:postgresql://tuxa.sme.utc/dblo17";
		String requete;
		// / TODO Utiliser cette ligne ou bien la suivante
		requete = requeque;
		// requete =
		// "select distinct fichier,rubrique from titretexte where mot='micro';";
		// /
		// INSTALL/load the Driver (Vendor specific Code)
		try {
			Class.forName("org.postgresql.Driver");
		} catch (java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}
		try {
			Connection con;
			Statement stmt;
			// Establish Connection to the database at URL with usename and
			// password
			con = DriverManager.getConnection(url, username, password);
			stmt = con.createStatement();
			// Send the query and bind to the result set
			ResultSet rs = stmt.executeQuery(requete);
			while (rs.next()) {
				String s = rs.getString("fichier");
				System.out.print(s);
				System.out.print("\t");
				s = rs.getString("rubrique");
				System.out.print(s);
				System.out.println();
			}
			// Close resources
			stmt.close();
			con.close();
		}
		// print out decent erreur messages
		catch (SQLException ex) {
			System.err.println("==> SQLException: ");
			while (ex != null) {
				System.out.println("Message:   " + ex.getMessage());
				System.out.println("SQLState:  " + ex.getSQLState());
				System.out.println("ErrorCode: " + ex.getErrorCode());
				ex = ex.getNextException();
				System.out.println("");
			}
		}
	}
	// /**
	// * Ancien code issu des fichiers du professeur (saisie.java)
	// */
	// public static void main(String[] args) {
	// String requete = "";
	// BufferedReader br = null;
	// try {
	// try {
	// br = new BufferedReader(new InputStreamReader(System.in));
	// System.out.print("saisie : ");
	// requete = br.readLine();
	// System.out.println("j'ai saisi " + requete);
	// } catch (EOFException e) {
	// br.close();
	// }
	// } catch (IOException e) {
	// System.out.println("IO Exception");
	// }
	// }
}