//Calculating total salary based on basic. If basic <=5000 da, ta and hra will be
//10%,20% and 25% respectively otherwise da, ta and hra will be 15%,25% and 30%
//respectively.


import java.util.Scanner;

public class q7 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        float basic , da, ta, hra , salary ;
	
	System.out.printf("enter basic salary : ");
	basic = sc.nextFloat();

	
	if(basic <= 5000) {
		da =(basic * 10 /100);
		ta = (basic * 20 /100);
		hra = (basic * 25 /100);
		
		salary = basic + da + ta + hra ;
		
		System.out.printf("salary is %f" , salary);
		
		
	}
	
	else {
		da =  (basic * 15 /100);
		ta =  (basic * 25 /100);
		hra =   (basic * 30 /100);
		
		salary = basic + da + ta + hra ;
		
		System.out.printf("salary is %f" , salary);
	}

        }
}