package main;

public class Seasonbooking extends Booking  {
	
	public double roomBooking(int persons,int total_days,double tariff,String roomtype)
	{
	double c=super.roomBooking(persons, total_days, tariff, roomtype);
	return c; 
	}
}
