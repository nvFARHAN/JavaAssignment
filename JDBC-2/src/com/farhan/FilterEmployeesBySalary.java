package com.farhan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FilterEmployeesBySalary {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String cs = "jdbc:mysql://localhost:3306/db1";

		try (Connection conn = DriverManager.getConnection(cs, "root", "Nawaz@786")) {
			PreparedStatement pt = conn.prepareStatement("select * from employee where salary<80000");
			ResultSet rs = pt.executeQuery();
			while (rs.next()) {
				System.out.println("eid : " + rs.getInt("eid"));
				System.out.println("name : " + rs.getString("name"));
				System.out.println("address : " + rs.getString("address"));
				System.out.println("salary : " + rs.getInt("salary"));
				System.out.println("================================");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
