//5. Write a C program to input five numbers and find their average.

void main() {
	float a1 , a2, a3, a4, a5 ,avg ;
	
	printf("enter five value line by line for average \n");
	
	scanf("%f %f %f %f %f" , &a1 , &a2, &a3, &a4, &a5 ) ;
	
	avg = (a1 + a2+a3+ a4+ a5) /5 ;
	
	printf("%f" , avg)  ;
	
	
	
}
