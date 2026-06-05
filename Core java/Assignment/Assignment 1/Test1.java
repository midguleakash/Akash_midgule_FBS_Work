class  Date {
	int day;
	int month;
	int year;
	String dow;

	// Default Constructor
	Date(){
		this.day = 5 ;
		this.month = 10 ;
		this.year = 2003 ;
		this.dow = "Monday";

	}

	// Parameterized Constructor
	Date(int d, int m, int y, String dow){
		this.day = d ;
		this.month = m ;
		this.year = y ;
		this.dow = dow ;

	}



	// setter
	void setDay(int d) {
		this.day = d ;
	}

	void setMonth(int m) {
		this.month = m ;
	}

	void setYear(int y) {
		this.year = y ;
	}

	void setDow(String dow) {
		this.dow = dow ;
	}



	// getter
	int getDay() {
		return this.day ;
	}

	int getMonth() {
		return this.month ;
	}

	int getYear() {
		return this.year ;
	}

	String getDow() {
		return this.dow;
	}


	void display() {
		System.out.println("Day is " + this.day);
		System.out.println("Month is " + this.month);
		System.out.println("Year is " + this.year);
		System.out.println("Day Of Week is " + this.dow);
		System.out.println();
	}

	public String toString() {
		return "Date [day=" + day +
          	       ", month=" + month +
        		", year=" + year +
          		", dow=" + dow + "]";
	}

} //class Date end here



class Test1 {
	public static void main(String args[]) {
		Date d1; // reference
		d1 = new Date(); // new object create
		
		System.out.println("HashCode : " + d1.hashCode());
		System.out.println(d1);
		

		// class date member without set value will be initilized by zero if it integer
		d1.display();
		
		// setting value using setter
		d1.setDay(12);
		d1.setMonth(5);
		d1.setYear(2000);

		// getting value using getting 		
		d1.display();
		

	}




} // class Test1 end here