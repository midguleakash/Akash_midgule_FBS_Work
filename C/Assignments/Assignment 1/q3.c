// Write a program to check whether a given year is a leap year.

void main() {
	
	//take input
	int year ;
	printf("enter year : ");
	scanf("%d" , &year);
	
	// check and print leap year or not
	if((year % 400 == 0) || (year % 4 == 0   && year % 100 != 0)) {
		printf("its leap year");
	}
	
	else {
		printf("its not leap year");
	}
}