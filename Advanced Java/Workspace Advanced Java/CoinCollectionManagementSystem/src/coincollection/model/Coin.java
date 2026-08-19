package coincollection.model;

import java.time.LocalDate;

public class Coin {
	int id;
	String country;
	String denomination ;
	int year ;
	double currentValue ;
	LocalDate acquiredDate ;
	
	public Coin() {
		
	}
	
	public Coin(String country, String denomination, int year, double currentValue, LocalDate acquiredDate) {		
		this.country = country;
		this.denomination = denomination;
		this.year = year;
		this.currentValue = currentValue;
		this.acquiredDate = acquiredDate;
	}
	
	public Coin(int id , String country, String denomination, int year, double currentValue, LocalDate acquiredDate) {		
		this.id = id ;
		this.country = country;
		this.denomination = denomination;
		this.year = year;
		this.currentValue = currentValue;
		this.acquiredDate = acquiredDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDenomination() {
		return denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(double currentValue) {
		this.currentValue = currentValue;
	}

	public LocalDate getAcquiredDate() {
		return acquiredDate;
	}

	public void setAcquiredDate(LocalDate acquiredDate) {
		this.acquiredDate = acquiredDate;
	}

	@Override
	public String toString() {
		return "Coin [id=" + id + ", country=" + country + ", denomination=" + denomination + ", year=" + year
				+ ", currentValue=" + currentValue + ", acquiredDate=" + acquiredDate + "]";
	}
	
	
	
}
