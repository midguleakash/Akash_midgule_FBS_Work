//9. Write a C program to input the base and height of a triangle and calculate its area.

 void main()  {
	float h , b ,area ;
	
	printf("enter the height :  ");
	scanf("%f" , &h) ;
	printf("\n enter the base : ");
	scanf("%f" , &b) ;
	
	
	area = 1.0/2 * (h * b) ;
	
	printf("area is %f" , area);


}
