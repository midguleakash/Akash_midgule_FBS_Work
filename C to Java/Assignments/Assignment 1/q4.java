// 4. Write a program to check whether a given character is a vowel or consonant.

import java.util.Scanner;

public class q4 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        //take input
	char ch ;
	System.out.printf("enter charchter : ");
	ch = sc.next().charAt(0);
	
//	check and print given character is a vowel or consonant
	if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' || ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U' ) {
		System.out.printf("%c is a vowel",ch);
	}
	
	else {
		System.out.printf("%c is consonant", ch);
	}

        }
}