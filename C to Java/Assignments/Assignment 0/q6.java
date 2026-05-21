import java.util.Scanner;

public class q6 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        float n , sq, cube ;
	
	System.out.printf("enter the number \n");
	
	n =  sc.nextFloat();

	
	sq = n * n ;
	cube = n*n*n ;
	
	System.out.printf("square is  %f \n" , sq)  ;
	System.out.printf("cube is  %f" , cube ) ;

       
        }
}