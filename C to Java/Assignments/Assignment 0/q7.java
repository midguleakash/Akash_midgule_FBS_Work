import java.util.Scanner;

public class q7 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int min  , hr;
	System.out.printf("enter the minutes \n");
	
	min =  sc.nextInt();

	
	hr = min / 60 ;
	min = min % 60;
	
	System.out.printf("hr is %d \nmin is %d" , hr,min);
       
        }
}