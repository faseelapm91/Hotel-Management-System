package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int persons;
		int total_days;
		double tariff=0;
		String roomtype;
		int month;
		double peakcharges;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Seasonbooking st=new Seasonbooking();
		Booking book=new Booking();
		Leanseason sn=new Leanseason();
		Peakseason tn=new Peakseason();
		System.out.println("Booking");
		System.out.println("Enter the number of persons");
		persons=Integer.parseInt(br.readLine());
		book.setPersons(persons);
		System.out.println("Enter the number of days");
		total_days=Integer.parseInt(br.readLine());
		book.setTotal_days(total_days);
		System.out.println("Enter the room type");
		roomtype=br.readLine();
		book.setroomtype(roomtype);
		System.out.println("Enter the month");
		month=Integer.parseInt(br.readLine());
		if(month ==1||month==3||month==7||month==8||month==9||month==10)
		{
		System.out.println("enter the discount");
		int d=Integer.parseInt(br.readLine());
		book.setDiscount(d);
		System.out.println("enter the tariff for single person");
		tariff=Double.parseDouble(br.readLine());
		book.setTariff(tariff);
		System.out.println("total tariff");
		double f=sn.roomBooking(persons, total_days,tariff,roomtype,month,d);
		System.out.println(f);
		 }
		else
		{
		System.out.println("enter the peak charges");
		peakcharges=Integer.parseInt(br.readLine());
		book.setPeakcharges(peakcharges);
		System.out.println("enter the tariff for single person");
		tariff=Double.parseDouble(br.readLine());
		book.setTariff(tariff);
		System.out.println("total tariff");
		double r=tn.roomBooking(persons, total_days, tariff,roomtype,month,peakcharges);
		System.out.println(r);
		}
	   }
      }

 