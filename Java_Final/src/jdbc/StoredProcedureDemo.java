package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StoredProcedureDemo {
	private static Connection con;
	private static Statement stmt;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
			String dbUrl = "jdbc:mysql://localhost:3306/animated_movies";
			String username = "root";
			String password = "root";
			String query = "{Call SELECTALLDIRECTORS()}";

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dbUrl, username, password);
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				// System.out.print("Title: " + rs.getString("TITLE") + "\t");
				// System.out.print("Genre: " + rs.getString("GENRE") + "\t");
				System.out.print("Director " + rs.getString("DIRECTOR") + "\t");
				// System.out.println("Release Year: " + rs.getInt("RELEASE_YEAR"));

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			stmt.close();
			con.close();
		}
	}
}
