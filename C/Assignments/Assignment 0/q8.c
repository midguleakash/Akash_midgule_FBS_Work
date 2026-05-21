//8. Write a C program to input the length and width of a rectangle and find its perimeter. 

void main()  {
	float l , b ,per ;
	
	printf("enter the length :  ");
	scanf("%f" , &l) ;
	printf("\n enter the breth : ");
	scanf("%f" , &b) ;
	
	
	per = 2 * (l + b) ;
	
	printf("perimeter is %f" , per);


}
