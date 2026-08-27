package demo.model;

public class Employee {
	int id ;
	String fName;
	String lName;
	String department;
	double salary;
	String city;
	
	public Employee() {
		
	}
	
	public Employee(int id, String fName, String lName, String department, double salary, String city) {		
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.department = department;
		this.salary = salary;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fName=" + fName + ", lName=" + lName + ", department=" + department
				+ ", salary=" + salary + ", city=" + city + "]";
	}
	
	
}
