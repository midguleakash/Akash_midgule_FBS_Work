import java.util.Scanner;

public class q5 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        float a1, a2, a3, a4, a5;

        System.out.println("Enter 5 numbers:");

        a1 = sc.nextFloat();
        a2 = sc.nextFloat();
        a3 = sc.nextFloat();
        a4 = sc.nextFloat();
        a5 = sc.nextFloat();

       float avg = (a1 + a2+a3+ a4+ a5) /5 ;
	
	System.out.printf("%f" , avg)  ;
    }
}