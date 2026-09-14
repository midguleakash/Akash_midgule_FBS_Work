package studentmanagement.dto;

public class StudentCityDTO {
	private String frn;
	private String name;
	private String city;
	private String state;

	public StudentCityDTO() {
	}

	public StudentCityDTO(String frn, String name, String city, String state) {

		this.frn = frn;
		this.name = name;
		this.city = city;
		this.state = state;
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
		return "StudentCityDTO [frn=" + frn + ", name=" + name + ", city=" + city + ", state=" + state + "]";
	}
}
