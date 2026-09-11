package studentmanagement.model;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

	@Id
	String frn;
	String name;
	LocalDate dob;
	
	@OneToOne(cascade = CascadeType.ALL)
	Address address;
	long mobno;
	
	@ManyToOne(cascade = CascadeType.ALL)
	Batch batch;

	public Student() {

	}

	public Student(String frn, String name, LocalDate dob, Address address, long mobno, Batch batch) {
		super();
		this.frn = frn;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.mobno = mobno;
		this.batch = batch;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getMobno() {
		return mobno;
	}

	public void setMobno(long mobno) {
		this.mobno = mobno;
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	@Override
	public String toString() {
		return "Student [frn=" + frn + ", name=" + name + ", dob=" + dob + ", address=" + address + ", mobno=" + mobno
				+ ", batch=" + batch + "]";
	}

}