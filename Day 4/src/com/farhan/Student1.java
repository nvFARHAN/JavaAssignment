package com.farhan;

public class Student1 {
	
	private int roll;
	private String name;
	private String address;
	private String collageName;
	
	public int getRoll()
	{
		return this.roll;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	public String getCollageName()
	{
		return this.collageName;
	}
	
	Student1(int roll,String name,String address)
	{
		this.roll=roll;
		this.name=name;
		this.address=address;
	}
	
	Student1(int roll,String name,String address,String collageName)
	{
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collageName=collageName;
	}
	public static Student1 getStudent(boolean isFromNIT)
	{
		if(isFromNIT)
		{
			return new Student1(201,"Madhuri Patel","U.P.","NIT Allahabad");
		}
		else
		{
			return new Student1(202,"Farhan Nawaz","Jharkhand","HITK");
		}
			
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 s1 = getStudent(true);
		System.out.println("Name : "+s1.getName());
		System.out.println("Roll : "+s1.getRoll());
		System.out.println("Collage Name : "+s1.getCollageName());
		System.out.println("Address : "+s1.getAddress());
		
		System.out.println();
		
		Student1 s2 = getStudent(false);
		System.out.println("Name : "+s2.getName());
		System.out.println("Roll : "+s2.getRoll());
		System.out.println("Collage Name : "+s2.getCollageName());
		System.out.println("Address : "+s2.getAddress());
	}

}
