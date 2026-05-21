import java.util.Scanner;

public class q1 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // take input
	
	int n ;
	System.out.printf("enter the number : ");
	n = sc.nextInt();
	
	// check and print , number is even or odd
	if(n % 2 == 0) 
		System.out.printf("number is even");
		
		else
			System.out.printf("number is odd");

        }
}