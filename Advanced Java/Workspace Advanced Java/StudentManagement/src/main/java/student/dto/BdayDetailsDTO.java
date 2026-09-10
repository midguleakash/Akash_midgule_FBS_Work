package student.dto;

import java.time.LocalDate;

public class BdayDetailsDTO {
	String frn;
	String name;
	LocalDate dob;
	
	public  BdayDetailsDTO() {
		
	}
	
	public BdayDetailsDTO(String frn, String name, LocalDate dob) {
		super();
		this.frn = frn;
		this.name = name;
		this.dob = dob;
	}
	
	public String getFrn() {
		return frn;
	}
	public void setFrn(String frn) {
		this.frn = frn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "BdayDetailsDTO [frn=" + frn + ", name=" + name + ", dob=" + dob + "]";
	}
	
	
}
