package com.farhan;
import java.util.Scanner;

public class Employee {
	private int employeeId;
	private String enmployeeName;
	private double salary;
	private double netSalary;
	
	Employee(){
		
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEnmployeeName() {
		return enmployeeName;
	}
	public void setEnmployeeName(String enmployeeName) {
		this.enmployeeName = enmployeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	
	public void calculateNetSalary(int pfpercentage)
	{
		double x = this.getSalary();
		x -= (x*pfpercentage)/100;
		this.setNetSalary(x); 
	}
	
	public static Employee getEmployeeDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee name : ");
		String name = sc.nextLine();
		System.out.println("Enter employee Id : ");
		int id = sc.nextInt();
		System.out.println("Enter employee salary : ");
		int salary = sc.nextInt();
		Employee e = new Employee();
		e.setEmployeeId(id);
		e.setEnmployeeName(name);
		e.setSalary(salary);
		sc.close();
		return e;
	}
	
	public static int getPFPercentage()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee pf percentage : ");
		int pf = sc.nextInt();
		sc.close();
		return pf;
	}
	
	public static void main(String[] args) {
		Employee e = Employee.getEmployeeDetails();
		int pf = Employee.getPFPercentage();
		e.calculateNetSalary(pf);
		System.out.println("Id : "+e.getEmployeeId());
		System.out.println("Name : "+e.getEnmployeeName());
		System.out.println("Salary : "+e.getSalary());
		System.out.println("Net Salary : "+e.getNetSalary());
	}

}
