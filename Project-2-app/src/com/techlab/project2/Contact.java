package com.techlab.project2;

import java.sql.*;

public class Contact extends JDBCConnection {
	private int rows = 0;
	private String line = "";

	public Contact() throws Exception {
		super();
	}

	public String display() throws SQLException {
		line = "";
		try {

			stmt = connection.createStatement();
			res = stmt.executeQuery("select * from Contact");

			while (res.next()) {
				line += "Fname = " + res.getString("fname") + ", Lname = "
			+ res.getString("lname") + ", Phone no = "+ res.getString("phoneno") +
			", Emailid = " + res.getString("emailid") + "\n";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return line;
	}

	public String search(String fname, String lname) throws SQLException {
		line = "";
		try {

			stmt = connection.createStatement();
			res = stmt.executeQuery("select * from Contact where fname='" +
			fname + "' and lname='" + lname + "'");

			while (res.next()) {
				line += "Fname = " + res.getString("fname") + ", Lname = " 
			+ res.getString("lname") + ", Phone no = "+ res.getString("phoneno")
			+ ", Emailid = " + res.getString("emailid") + "\n";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return line;
	}

	public int add(String fname, String lname, String phoneno, String email) throws SQLException {
		try {
			line = "insert into Contact value" + "('" + fname + "','" + lname + 
					"','" + phoneno + "','" + email + "')";
			rows = stmt.executeUpdate(line);
			return rows;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int delete(String fname, String lname) throws SQLException {
		try {
			line = "delete from Contact where fname='" + fname + "' and lname='" + lname + "'";
			rows = stmt.executeUpdate(line);
			return rows;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;

	}

	public boolean show(String fname, String lname, String phoneno) {
		line = "";
		try {
			String line1 = "Select * from Contact where fname='" + fname +
					"' and lname='" + lname + "' and phoneno='"
					+ phoneno + "'";
			res = stmt.executeQuery(line1);
			while (res.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	public void update(String fname, String lname, String phoneno, String newphoneno) {
		try {
			line = "update Contact set phoneno='" + newphoneno + "' where fname='" +
		fname + "' and lname='" + lname
					+ "' and phoneno='" + phoneno + "'";
			
			rows = stmt.executeUpdate(line);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void closeConnection() throws SQLException {
		connection.close();
	}
}
