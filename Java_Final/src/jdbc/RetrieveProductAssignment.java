package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveProductAssignment {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/dog1_supplies";
		String username = "root";
		String password = "root";
		String query = "select * from leashes;";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			System.out.print("\n");
			System.out.println("Color: " + rs.getString("Color"));
			System.out.println("Size: " + rs.getString("Size"));
			System.out.println("Material: " + rs.getString("Material"));
		
			
		}
	
	}
	
}


