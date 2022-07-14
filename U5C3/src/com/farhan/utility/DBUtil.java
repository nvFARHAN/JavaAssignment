package com.farhan.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection provideConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String cs = "jdbc:mysql://localhost:3306/db1";

		try {
			conn = DriverManager.getConnection(cs, "root", "Nawaz@786");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
