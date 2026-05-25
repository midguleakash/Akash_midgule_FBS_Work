//Write a program to find greatest of three numbers using nested if-else.


import java.util.Scanner;

public class q3 {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		float x,y,z ;
	
		System.out.printf("enter 1st number x : " );
		x = sc.nextFloat();

	
		System.out.printf("enter 1st number y : " );
		y = sc.nextFloat();

	
		System.out.printf("enter 1st number z : " );
		z = sc.nextFloat();

	
		if(x>y){
			if(x>z){
				System.out.printf("x : %f is greater", x);
			}
		
			else {
				System.out.printf("z : %f is greater",z);
			}
		}
	
		else {
			if(y>z){
				System.out.printf("y : %f is greater", y);
			}
		
			else {
				System.out.printf("z : %f is greater",z);
			}
		}
		


	}


}