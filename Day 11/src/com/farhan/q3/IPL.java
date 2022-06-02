package com.farhan.q3;
import java.util.Scanner;

public class IPL {
	void homeTeamStadium(Stadium stadium)
	{
		stadium.message();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stadium name(in uppercase) : ");
		Stadium s = Stadium.valueOf(sc.next());
		IPL ipl = new IPL();
		ipl.homeTeamStadium(s);
		sc.close();
	}
}
