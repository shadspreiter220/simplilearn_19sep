package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUpdateDemo {
	private static Connection con;
	private static Statement stmt;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
			String dbUrl = "jdbc:mysql://localhost:3306/animated_movies";
			String username = "root";
			String password = "root";
			String query = "Update MOVIES Set release_year = '2009' where title = 'WallE'";

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dbUrl, username, password);
			stmt = con.createStatement();
			stmt.execute(query);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			stmt.close();
			con.close();
		}
	}
}


