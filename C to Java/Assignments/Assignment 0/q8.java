import java.util.Scanner;

public class q8 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        float l , b ,per ;
	
	System.out.printf("enter the length :  ");
	l =  sc.nextFloat();

	System.out.printf("\n enter the breth : ");
	b =  sc.nextFloat();

	
	
	per = 2 * (l + b) ;
	
	System.out.printf("perimeter is %f" , per);
        }
}