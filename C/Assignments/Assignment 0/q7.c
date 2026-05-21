//7. Write a C program to convert given minutes into hours and remaining minutes.

void main () {
	
	int min  , hr;
	printf("enter the minutes \n");
	
	scanf("%d" , &min) ;
	
	hr = min / 60 ;
	min = min % 60;
	
	printf("hr is %d \n   min is %d" , hr,min);
	
	
}
