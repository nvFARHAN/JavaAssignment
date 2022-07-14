package com.farhan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GetSalaryById {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID : ");
		int id = sc.nextInt();
		sc.close();
		String cs = "jdbc:mysql://localhost:3306/db1";

		try (Connection conn = DriverManager.getConnection(cs, "root", "Nawaz@786")) {
			PreparedStatement st = conn.prepareStatement("select salary from employee where eid = ?");
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				System.out.println("salary : " + rs.getInt("salary"));
			} else {
				System.out.println("No data found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
