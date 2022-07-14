package com.farhan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GetEmployeeById {

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
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from employee where eid = " + id + "");
			if (rs.next()) {
				System.out.println("eid : " + rs.getInt("eid"));
				System.out.println("name : " + rs.getString("name"));
				System.out.println("address : " + rs.getString("address"));
				System.out.println("salary : " + rs.getInt("salary"));
				System.out.println("===================================");
			} else {
				System.out.println("No data found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
