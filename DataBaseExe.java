package com.airline.control;

import java.sql.*;

public class DataBaseExe {

	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:sqlserver://192.168.168.12:1433;databaseName=New_joinee_2022", "sa",
					"P@ssw0rd");

			Statement stmt = con.createStatement();
			ResultSet set= stmt.executeQuery("insert into details values('black',111,33,'erode','chennai','hydrabad','1989-09-12')");
			
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
