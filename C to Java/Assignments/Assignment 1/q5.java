// Write a program to check whether a person is eligible to vote (age = 18).

import java.util.Scanner;

public class q5 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // take input
	int age ;
	System.out.printf("enter age : ");
	age = sc.nextInt();
	
	// check and print person is eligible to vote 
	if(age >= 18)
		System.out.printf("eligible for vote");
		
	else
		System.out.printf("not eligible for vote");

        }
}