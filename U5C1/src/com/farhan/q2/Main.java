package com.farhan.q2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpId("14523");
		e.setEmpName("Alpha");
		e.setEmail("alpha@gmail.com");
		e.setPassword("alpha@123");
		Address a = new Address();
		a.setCity("Kolkata");
		a.setState("West Bengal");
		a.setPincode(400107);
		e.setAddress(a);

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.txt"));
			oos.writeObject(e);

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.txt"));
			Employee e1 = (Employee) ois.readObject();
			System.out.println(e1);
			oos.close();
			ois.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
