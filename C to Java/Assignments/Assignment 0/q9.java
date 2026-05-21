import java.util.Scanner;

public class q9 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        	double h , b ,area ;
	
	System.out.printf("enter the height :  ");
	h = sc.nextDouble();

	System.out.printf("\n enter the base : ");
	b = sc.nextDouble();

	
	
	area = 1.0/2 * (h * b) ;
	
	System.out.printf("area is %f" , area);

        }
}