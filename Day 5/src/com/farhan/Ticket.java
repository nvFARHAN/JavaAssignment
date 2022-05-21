package com.farhan;
import java.util.Scanner;

public class Ticket {
	private int ticketId;
	private int price;
	private static int availableTickets;
	
	Ticket()
	{
		
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets>0)
			Ticket.availableTickets = availableTickets;
		else
			System.out.println("Enter valid number of available tickets.");
	}
	public int calculateTicketCost(int nooftickets)
	{
		int availableTickets = Ticket.getAvailableTickets();
		if(availableTickets>nooftickets)
		{
			Ticket.setAvailableTickets(availableTickets-nooftickets);
			int price = this.getPrice();
			return nooftickets*price;
		}
		else
			return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of bookings : ");
		int bookings = sc.nextInt();
		System.out.println("Enter the available tickets : ");
		int availableTickets = sc.nextInt();
		Ticket.setAvailableTickets(availableTickets);
		
		for(int i=0;i<bookings;i++)
		{
			Ticket T = new Ticket();
			System.out.println("Enter the ticketid : ");
			int id = sc.nextInt();
			System.out.println("Enter the price");
			int price = sc.nextInt();
			System.out.println("Enter the no of tickets : ");
			int nooftickets = sc.nextInt();
			T.setPrice(price);
			T.setTicketId(id);
			System.out.println("Availabe tickets : "+Ticket.getAvailableTickets());
			int amount = T.calculateTicketCost(nooftickets);
			if(amount>0)
			{
				System.out.println("Total Amount : "+amount);
				System.out.println("Available tickets after booking : "+Ticket.getAvailableTickets());
			}
			else
				System.out.println("Sufficient tickets not available.");
		}
		sc.close();
	}
}
