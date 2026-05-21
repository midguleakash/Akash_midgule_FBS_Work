// Write a program to check given 3 digit number is pallindrome or not.


void main(){
	
	//take input number
	int number , d1, d2, d3;
	printf("enter the number : ");
	scanf("%d" , &number);
	
	//calculate digit for reverse number
	int n = number ;
	
	d1 = n % 10;
	n = n / 10 ;
	
	d2 = n % 10 ;
	n = n / 10;
	
	d3 = n % 10;
	
	// # calculate  reverse number
	int reverse = (d1 * 100) + (d2 * 10) + d3 ;
	
	// check and print , number is palindrome or not
	if(number == reverse){
		printf("number is palindrome");
	
	}
	
	else {
		printf("number is not palindrome");
	}
	
	
}