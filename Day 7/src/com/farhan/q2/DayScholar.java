package com.farhan.q2;

public class DayScholar extends Student {
	double transportFee;

	public DayScholar(int studId, String studName, double examFee, double transportFee) {
		super(studId, studName, examFee);
		this.transportFee = transportFee;
	}
	
	double payFee(double fee) {
		double x = super.payFee(fee);
		if(x>0)
		{
			if(x>this.transportFee)
			{
				x=this.transportFee - x;
				this.transportFee = 0;
				return x;
			}
			else
			{
				this.transportFee -= x;
				return this.transportFee;
			}
		}
		else
		{
			return this.examFee+this.transportFee;
		}
		
	}
	
}
