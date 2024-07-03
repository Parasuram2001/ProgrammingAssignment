package Dsa;

public class RedBus {
	String[] passengerName;
	
	public RedBus(int numberOfSeats) {
		// TODO Auto-generated constructor stub
		passengerName=new String[numberOfSeats];
		for(int i=0;i<passengerName.length;i++)
		{
			passengerName[i]="";
		}
	} 
	
	public void booking(int seatNumber,String name)
	{
		try
		{
			if(passengerName[seatNumber].equals(""))
			{
				passengerName[seatNumber]=name;
				System.out.println(seatNumber+" seat is registered");
			}
			else {
				System.out.println(seatNumber+"The seat is already booked");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid seat number");
		}
	}
	
	public void displayData()
	{
		for(int i=0;i<passengerName.length;i++)
		{
			System.out.print(passengerName[i]+" ");
		}
		System.out.println();
	}
	
	public int checking(String name)
	{
		for(int i=0;i<passengerName.length;i++)
		{
			if(passengerName[i].equals(name))
			{
				System.out.println("the passenger is present in the "+i+" seat number");
				return 1;
			}
		}
		System.out.println("the person is not present");
		return 0;
	}
	
	public void cancellation(int seatNumber)
	{
		try
		{
			passengerName[seatNumber]="";
			System.out.println("the ticket is cancelled of that seat "+seatNumber);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("The seatnumber is invalid");
		}
	}
	
}
