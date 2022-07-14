package com.farhan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BonusToEmployees {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String cs = "jdbc:mysql://localhost:3306/db1";

		try (Connection conn = DriverManager.getConnection(cs, "root", "Nawaz@786")) {
			PreparedStatement pt = conn.prepareStatement("update employee set salary = salary + 50");
			int x = pt.executeUpdate();
			if (x > 0)
				System.out.println("Added bonus to the salary...");
			else
				System.out.println("Salary not updated...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
