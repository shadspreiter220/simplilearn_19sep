package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropDB {
	private static Connection con;
	private static Statement stmt;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
			String dbUrl = "jdbc:mysql://localhost:3306";
			String username = "root";
			String password = "root";
			String query = "Drop Database action_movies";

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
