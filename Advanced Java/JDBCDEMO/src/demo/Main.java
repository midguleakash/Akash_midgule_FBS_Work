package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class loded successfully");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/somedb", "root" , "Akashdada1234@");
			System.out.println("connect db successfully");
			
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery("cc");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		 
	}
	
}
