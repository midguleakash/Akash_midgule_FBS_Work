//Accept three sides of a triangle from the user and determine whether the triangle is
//equilateral, isosceles, or scalene.

import java.util.Scanner;

public class q2 {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);


		float x,y,z ;
	
		System.out.printf("enter 1st side : " );
		x = sc.nextFloat();

	
		System.out.printf("enter 1st side : " );
		y = sc.nextFloat();

	
		System.out.printf("enter 1st side : " );
		z = sc.nextFloat();

	
	
		//check traingle is valid or not
		
		// traingle is valid or not
		if((x + y > z) && (y+z > x)  && (x+z > y)) {
		
			// All three sides are equal
			if(x == y  && y == z){
				System.out.printf("traingle is equilateral \n");
			}
		
			// Any two sides are equal
			if(x == y  || y == z  || x==z){
				System.out.printf("Triangle is Isosceles");
			}
		
		
			// All sides are different
			else {
				System.out.printf("Triangle is Scalene");
			}
		}
	
		else {
			System.out.printf("Not a valid triangle");
		}	



	}


}