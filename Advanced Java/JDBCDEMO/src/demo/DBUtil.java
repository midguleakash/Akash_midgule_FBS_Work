package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	static Connection con ;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class loded successfully");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/somedb", "root" , "Akashdada1234@");
			System.out.println("connect db successfully");
			
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection() {
		return con ;
	}
}
