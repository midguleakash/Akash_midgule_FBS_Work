// Write a program to check whether a given year is a leap year.

import java.util.Scanner;

public class q3 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

       // take input
	int year ;
	System.out.printf("enter year : ");
	year = sc.nextInt();

	
	// check and print leap year or not
	if((year % 400 == 0) || (year % 4 == 0   && year % 10 != 0)) {
		System.out.printf("its leap year");
	}
	
	else {
		System.out.printf("its not leap year");
	}

        }
}