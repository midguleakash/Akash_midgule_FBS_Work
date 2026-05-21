import java.util.Scanner;

public class q10 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        float a1 , a2, a3, a4, a5 ,avg ;
	
	System.out.printf("enter marks of student line by line for average \n");
	
	a1 = sc.nextFloat();
        a2 = sc.nextFloat();
        a3 = sc.nextFloat();
        a4 = sc.nextFloat();
        a5 = sc.nextFloat();
	
	avg = (a1 + a2+a3+ a4+ a5) /5 ;
	
	System.out.printf("percentage is %f" , avg)  ;

        }
}