package assignment;

import java.util.Objects;

public class Student {
	int frn;
	String name;
	int distance;
	
	public Student() {
		
	}
	
	public Student(int frn, String name, int distance) {		
		this.frn = frn;
		this.name = name;
		this.distance = distance;
	}

	
	// getter
	public int getFrn() {
		return frn;
	}

	public void setFrn(int frn) {
		this.frn = frn;
	}

	public String getName() {
		return name;
	}

	
	// setters
	public void setName(String name) {
		this.name = name;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	
	public void display() {
		System.out.println("Student frn=" + frn + ", name=" + name + ", distance=" + distance );
	}

	@Override
	public String toString() {
		return "Student [frn=" + frn + ", name=" + name + ", distance=" + distance + "]";
	}
	

}
