package com.farhan.q2;

public class ScienceStudent extends Student {
	
	double physicsMarks;
	double chemistryMarks;
	double mathMarks;

	

	public ScienceStudent(String name, String address, int physicsMarks, int chemistryMarks, int mathMarks) {
		super(name, address);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathMarks = mathMarks;
	}



	@Override
	double getPercentage() {
		// TODO Auto-generated method stub
		double p = ((this.chemistryMarks+this.mathMarks+this.physicsMarks)/3);
		return p;
	}

}
