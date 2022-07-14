package com.farhan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PartialInsertion {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name : ");
		String name = sc.nextLine();
		System.out.println("Enter salary : ");
		int salary = sc.nextInt();
		sc.close();
		String cs = "jdbc:mysql://localhost:3306/db1";

		try (Connection conn = DriverManager.getConnection(cs, "root", "Nawaz@786")) {
			PreparedStatement st = conn.prepareStatement("insert into employee (eid,name,salary) values (?,?,?);");
			st.setInt(1, id);
			st.setString(2, name);
			st.setInt(3, salary);
			int x = st.executeUpdate();
			if (x > 0)
				System.out.println("Inserted into table employee...");
			else
				System.out.println("Not inserted...");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
