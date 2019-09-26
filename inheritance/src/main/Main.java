package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int persons;
		int total_days;
		double tariff;
		String roomtype;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Seasonbooking n=new Seasonbooking();
		Booking book=new Booking();
		System.out.println("Enter the number of persons");
		persons=Integer.parseInt(br.readLine());
		book.setPersons(persons);
		System.out.println("Enter the number of days");
		total_days=Integer.parseInt(br.readLine());
		book.setTotal_days(total_days);
		System.out.println("Enter the room type");
		roomtype=br.readLine();
		book.setroomtype(roomtype);
		
		System.out.println("enter the tariff for single person");
		tariff=Double.parseDouble(br.readLine());
		book.setTariff(tariff);
		double t=n.roomBooking(persons, total_days, tariff, roomtype);
		System.out.println(t);
	}

}
