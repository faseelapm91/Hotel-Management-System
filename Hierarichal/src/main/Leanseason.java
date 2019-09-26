package main;

public class Leanseason extends Booking
{
	int month;
	int discount;
	String roomtype;
	double roomBooking(int persons,int total_days,double tariff,String roomtype,int month,int discount)
	{
		double c=super.roomBooking(persons, total_days, tariff, roomtype);
		{
		double d=c*discount/100;
		return c-d;
	}

}
}

