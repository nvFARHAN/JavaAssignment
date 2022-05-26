package com.farhan.q2;

public class Hosteller extends Student{
	double hostelFee;

	public Hosteller(int studId, String studName, double examFee, double hostelFee) {
		super(studId, studName, examFee);
		this.hostelFee = hostelFee;
	}
	double payFee(double fee) {
		double x = super.payFee(fee);
		if(x>0)
		{
			if(x>this.hostelFee)
			{
				x=this.hostelFee - x;
				this.hostelFee = 0;
				return x;
			}
			else
			{
				this.hostelFee -= x;
				return this.hostelFee;
			}
		}
		else
		{
			return this.examFee+this.hostelFee;
		}
		
	}
}
