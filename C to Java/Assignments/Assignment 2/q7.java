/* Accept the age and check if the person is:
Child (age < 12),Teenager (12–19),Adult (20–59),Senior (60 and above) */

import java.util.Scanner;

public class q7 {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);


		int age ;
	
		System.out.printf("enter age : ");
		age = sc.nextInt();

	
	
		if((age < 12) && (age >= 0))  {
			System.out.printf("Child");
		}
	
		else if((age >= 12) && (age <= 19))  {
			System.out.printf("Teenager");
		}
	
		else if((age >= 20) && (age <= 59))  {
			System.out.printf("Adult");
		}
	
		else if((age >= 60) )  {
			System.out.printf("Senior");
		}
	
		else  {
			System.out.printf("enter valid age");
		}


	}

}