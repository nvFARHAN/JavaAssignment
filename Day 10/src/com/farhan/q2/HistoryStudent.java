package com.farhan.q2;

public class HistoryStudent extends Student{

		double historyMarks;
		double civicsMarks;
	
	

	public HistoryStudent(String name, String address, int historyMarks, int civicsMarks) {
			super(name, address);
			this.historyMarks = historyMarks;
			this.civicsMarks = civicsMarks;
		}



	@Override
	double getPercentage() {
		// TODO Auto-generated method stub
		double p = ((this.civicsMarks+this.historyMarks)/2);
		return p;
	}

}
