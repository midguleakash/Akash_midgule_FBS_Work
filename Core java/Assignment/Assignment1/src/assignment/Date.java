package assignment;

public class Date {
	
	//Attribute 
	private int day;
	private int month;
	private int year;
	private String dow ;
	
	//default construtor
	public Date(){		
	}
	
	//parameterized constructor
	public Date(int day, int month, int year, String dow) {
		this.day = day;
		this.month = month;
		this.year = year ;
		this.dow = dow ;
	}
	
	
	//Getter
	
	public int getDay() {
		return this.day;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public String getDow() {
		return this.dow;
	}
	
	
	//setters
	
	public void setDay(int day) {
		this.day = day ;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setYear(int year) {
		this.year = year ;
	}
	
	public void setDow(String dow) {
		this.dow = dow ;
	}
	
	
	public void display() {
		System.out.println("Date : " + day + "/" + month + "/" + year + ": , "  + dow );
	}
	
	
	public String toString() {
		return "Date : [ " + day + "/" + month + "/" + year + ": , "  + dow + " ]"  ;
	}
}
