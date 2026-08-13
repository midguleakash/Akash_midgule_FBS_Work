package assignment;

public class Main {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		d1.display();
		
		Date d2 = new Date(05,12,2026,"thursday");
		System.out.println(d2);
		d2.display();
		
		
		Student s1 = new Student();
		System.out.println(s1);
		s1.display();
		
		Student s2 = new Student(10, "akash", 150);
		System.out.println(s2);
		s2.display();
	}
}
