package com.farhan.q2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {
		Student s = new Student();
		s.setRoll(10);
		s.setName("Alpha");
		s.setEmail("alpha@gmail.com");
		s.setPassword("alpha@123");
		Address a = new Address();
		a.setCity("Kolkata");
		a.setState("West Bengal");
		a.setPincode("400701");
		s.setAddress(a);
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
			oos.writeObject(s);
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));
			Student s1 = (Student) ois.readObject();
			System.out.println("Roll : " + s1.getRoll());
			System.out.println("Name : " + s1.getName());
			System.out.println("Address : " + s1.getAddress());
			System.out.println("Email : " + s1.getEmail());
			System.out.println("Password : " + s1.getPassword());
			oos.close();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
