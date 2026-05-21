/* Write a menu driven program to take a number for user and perform operations as follows.

Press 1.To check number is even or odd.
2.To check number is prime or not.
3.To check number is pallindrome or not.
4.To check number is positive, negative or zero.
5.To reverse a number.
6.To find sum of digits.
*/

void menu(int n , char op){
		// Press 1.To check number is even or odd.
	if(op == 1) {
		if(n % 2 == 0){
			printf("number is even");
		}
		
		else {
			printf("number is odd");
		}
	}
	
	
	// Press 2.To check number is prime or not.
	else if(op == 2) {
		
		int flag = 1 ;
		
		if(n <= 1){
			flag = 0 ;
		}
		
		for(int i = 2 ; i < n ; i++){
			if(n % i == 0){
				flag = 0 ;
			}
		}
		if(flag){
			printf("number is prime");
		}
		
		else {
			printf("number is not prime");
		}
	}
	
	
	// Press 3. To check number pallindrome or not.
	else if(op == 3) {
		
		int temp = n , reverse ;
		
		while(temp > 0){
			int digit = temp % 10;
			temp = temp / 10 ;
			reverse = reverse * 10 + digit ;
		}
		if(reverse == n){
			printf("number is pallindrome");
		}
		
		else {
			printf("number is not pallindrome");
		}
	}
	
	
	// Press 4.To check number is positive, negative or zero.
	else if(op == 4) {
		if(n > 0){
			printf("number is positive");
		}
		
		else if(n < 0){
			printf("number is negative");
		}
		else {
			printf("number is zero");
		}
	}
	
	
	// Press 5.To reverse a number.
	else if(op == 5) {
		int temp = n , reverse = 0;
		
		while(temp > 0){
			int digit = temp % 10;
			temp = temp / 10 ;
			reverse = reverse * 10 + digit ;
		}
		
		printf("reverse of number  is : %d", reverse);
	}
	
	
	// Press 6.To find sum of digits.
	else if(op == 6) {
		int sum = 0 ;
		int temp = n ;
		while(  temp > 0){
			int digit = temp % 10;
			temp = temp / 10 ;
			sum = sum + digit ;
			
		}
		
		printf("sum of digit of number is : %d", sum);
		
	}
	
	else {
		printf("choose right or valid key to perform operation");
	}
} 

void main() {
	
	int n , op;
	printf("enter number : ");
	scanf("%d", &n);
	
	printf("\n Press 1. To check number is even or odd. : ");
	printf("\n Press 2. To check number is prime or not. : ");
	printf("\n Press 3. To check pallindrome or not. : ");
	printf("\n Press 4. To is positive, negative or zero. : ");
	printf("\n Press 5. To reverse a number. : ");
	printf("\n Press 6. To find sum of digits. : ");
	scanf("%d", &op);
	

	
	menu(n, op);
	
}