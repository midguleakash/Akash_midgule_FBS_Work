/* Sum of numbers in given range.
Find sum of numbers from start to end.
Input: start = 1, end = 5
Output: 15  */


import java.util.Scanner;

public class q3 {

    public static void main(String args[]) {

        int start = 1 , end = 5 , sum = 0;
	while(start <= end) {
		sum = sum + start ;
		start++ ;
	}
	
	System.out.printf("sum is : %d", sum);

	
	
        }
}