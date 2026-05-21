// Write a program to check whether a person is eligible to vote (age = 18).

void check() {
	// take input
	int age ;
	printf("enter age : ");
	scanf("%d" , &age);
	
	// check and print person is eligible to vote 
	if(age >= 18)
		printf("eligible for vote");
		
	else
		printf("not eligible for vote");
}


void main() {
	check();
	
}