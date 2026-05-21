// swap number

void swap(int *a, int *b){
	
	printf("\na and b in swap function before swap a : %d , b : %d", *a , *b);
	
	int c = *a;
	*a = *b ;
	*b = c ;
	
	printf("\na and b in swap function after swap a : %d , b : %d", *a , *b);
}

void main() {
	int a=10 , b = 20 ;
	printf("\na and b in main function before swap a : %d , b : %d", a , b);
	
	swap(&a, &b);
	
	printf("\na and b in main function after swap a : %d , b : %d", a , b);
}