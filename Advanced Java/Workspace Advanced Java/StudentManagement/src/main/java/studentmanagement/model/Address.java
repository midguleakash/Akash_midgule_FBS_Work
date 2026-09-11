package studentmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {

	@Id
    int id;

    int pincode;
    String laneno;
    String houseno;
    String city;
    String state;
    
    public Address() {
    	
    }
    
    public Address(int id, int pincode, String laneno, String houseno, String city, String state) {
		super();
		this.id = id;
		this.pincode = pincode;
		this.laneno = laneno;
		this.houseno = houseno;
		this.city = city;
		this.state = state;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public String getLaneno() {
		return laneno;
	}


	public void setLaneno(String laneno) {
		this.laneno = laneno;
	}


	public String getHouseno() {
		return houseno;
	}


	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "Address [id=" + id + ", pincode=" + pincode + ", laneno=" + laneno + ", houseno=" + houseno + ", city="
				+ city + ", state=" + state + "]";
	}
	
	
    
    

}