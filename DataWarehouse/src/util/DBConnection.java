package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
	
	//Connection control database

	public static Connection getControlConnection(String url, String user, String password) throws ClassNotFoundException, SQLException {
		Connection con;
		if (con == null || con.isClosed()) {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			return con;
		} else {
			return con;
		}
	}
	
}
