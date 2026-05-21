/* Check the given number is Palindrome number or not.
Input: n = 121
Output: Palindrome  

A Palindrome Number is a number that remains the same when its digits are reversed.

Example 1: 121
Reverse of 121 = 121
? Same ? Palindrome
*/

void palindrome() {
	int n , reverse = 0 , digit ;
	printf("enter number : ");
	scanf("%d" , &n);
	
	
	
	int temp = n ;
	
	while(temp > 0) {
		digit = temp % 10 ;
		temp = temp / 10 ;		
		
		reverse = reverse * 10 + digit;
		
	}
	
	// check palindrome
    if(reverse == n) {
        printf("Palindrome");
    }
    else {
        printf("Not Palindrome");
    }
}


void main() {
	palindrome();
	
}