package main;

public class Peakseason extends Booking
{
    int month;
    double peakcharges;
    public  double roomBooking(int persons,int total_days,double tariff,String roomtype,int month,double peakcharges)
    {
    	double c=super.roomBooking(persons, total_days, tariff, roomtype);
        {
        	 return c*peakcharges;
        }
    }
    }

