// Write a program to check whether a number is even or odd.


void check() {
	// take input
	
	int n ;
	printf("enter the number : ");
	scanf("%d" , &n);
	
	// check and print , number is even or odd
	if(n % 2 == 0) 
		printf("number is even");
		
		else
			printf("number is odd");
}

void main() {
	
	check();	
}