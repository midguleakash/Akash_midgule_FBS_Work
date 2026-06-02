// find which date age is greater base on two date

class  Date {
	int day;
	int month;
	int year;

	void setDay(int d) {
		this.day = d ;
	}

	void setMonth(int m) {
		this.month = m ;
	}

	void setYear(int y) {
		this.year = y ;
	}


	int getDay() {
		return this.day ;
	}

	int getMonth() {
		return this.month ;
	}

	int getYear() {
		return this.year ;
	}

} //class Date end here


class Test1 {
	public static void main(String args[]) {
		Date d1 ; // reference
		d1 = new Date(); // new object create
		
		Date d2 ; // reference
		d2 = new Date(); // new object create

		System.out.println(d1);
		System.out.println(d1);

		d1.day = 10 ;
		// set d1
		d1.setDay(2);
		d1.setMonth(4);
		d1.setYear(2000);

		// set d2
		d2.setDay(2);
		d2.setMonth(4);
		d2.setYear(2000);
	
		

		if(d2.getYear() > d1.getYear()){
			System.out.println("d1 is greater age");
		}
		
		else if(d2.getYear() < d1.getYear()) {
			System.out.println("d2 is greater age");
		}

		
		else {
			if(d2.getMonth() > d1.getMonth()){
				System.out.println("d1 is greater age");
			}
		
			else if(d2.getMonth() < d1.getMonth()) {
				System.out.println("d2 is greater age");
			}
			
			else {
				if(d2.getDay() > d1.getDay()){
					System.out.println("d1 is greater age");
				}
		
				else if(d2.getDay() < d1.getDay()) {
					System.out.println("d2 is greater age");
				}

				else {
					System.out.println("both have same age");

				}

			}

		}

	}




} // class Test1 end here