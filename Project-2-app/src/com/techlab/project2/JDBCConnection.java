package com.techlab.project2;
import java.sql.*;
public class JDBCConnection {
	public Connection connection =null;
	public java.sql.Statement stmt = null;
	public ResultSet res = null;
	public JDBCConnection() throws ClassNotFoundException, SQLException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection= DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/swabhav_techlab?user=root&password=root");
	
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
