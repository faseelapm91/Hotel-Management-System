package main;

public class Booking {
	int persons;
	int total_days;
	double tariff;
	String roomtype;
	double total;
	double peakcharges;
	public double getPeakcharges() {
		return peakcharges;
	}
	public void setPeakcharges(double peakcharges) {
		this.peakcharges = peakcharges;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	double discount;
	public int getPersons() {
		return persons;
	}
	public void setPersons(int persons) {
		this.persons = persons;
	}

	public int getTotal_days() {
		return total_days;
	}
	public void setTotal_days(int total_days) {
		this.total_days = total_days;
	}
	public double getTariff() {
		return tariff;
	}
	public void setTariff(double tariff) {
		this.tariff = tariff;
	}
	public String getroomtype() {
		return roomtype;
	}
	public void setroomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public double roomBooking(int persons,int total_days,double tariff,String roomtype)
	{
		
		 total=persons*total_days*tariff;
		 return total;
		
	}
	}


