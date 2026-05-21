//10. Write a C program to input marks of five subjects, find the total marks, and calculate the percentage. 

void main() {
	float a1 , a2, a3, a4, a5 ,avg ;
	
	printf("enter marks of student line by line for average \n");
	
	scanf("%f %f %f %f %f" , &a1 , &a2, &a3, &a4, &a5 ) ;
	
	avg = (a1 + a2+a3+ a4+ a5) /5 ;
	
	printf("percentage is %f" , avg)  ;
	
	
	
}
