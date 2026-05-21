// Write a program to check whether a given character is uppercase or lowercase.

import java.util.Scanner;

public class q6 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        char ch ;
	
	System.out.printf("enter charchter : ");
	ch = sc.next().charAt(0);
	
	if (ch >= 'A' && ch <='Z'){
		System.out.printf("Uppercase");
	}
	
	else if(ch >= 'a' && ch <= 'z'){
		System.out.printf("lowercase");
	}
	
	else {
		System.out.printf("it not a charcter");
	}

        }
}