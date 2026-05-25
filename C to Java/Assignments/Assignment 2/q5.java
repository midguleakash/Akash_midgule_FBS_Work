/* Accept the price from user. Ask the user if he is a student (user may say y or n). If he
is a student and he has purchased more than 500 than discount is 20% otherwise
discount is 10%.But if he is not a student then if he has purchased more than 600
discount is 15% otherwise there is not discount. */


import java.util.Scanner;

public class q5 {

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		float purchased , discount , amount ;
		char ch ;
	
		System.out.printf("enter purchase amount : ");
		purchased = sc.nextFloat();

	
		System.out.printf("you are student say 'y' , or 'n' : ");
		ch = sc.next().charAt(0);
	
		if((ch == 'y') && (purchased > 500)){
			discount = 20 ;
		}
	
		else if((ch == 'y') && (purchased <= 500)){
			discount = 10 ;
		}
	
		else if((ch == 'n') && (purchased > 600)){
			discount = 15 ;
		}
	
		else {
			discount = 0 ;
		}
	
	
		amount = purchased - (purchased *  discount /  100);
		System.out.printf("final amount is : %f" , amount);


	}

}