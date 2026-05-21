// Find odd and even among the numbers.

void printEven(int arr[],int size){
	printf("even number in array are  : ");
	for(int i=0 ; i < size ; i++){
		if(arr[i] % 2 == 0) {
			printf("%d  " ,arr[i] );
		}
		
	}
}

void printOdd(int arr[],int size){
	printf("\nodd number in array are  : ");
	for(int i=0 ; i < size ; i++){
		if(arr[i] % 2 != 0) {
			printf("%d  " ,arr[i] );
		}
		
	}
}

void main() {
	int arr[6] = {2,5,8,4,6,0};
	int size = sizeof(arr) / sizeof(arr[0]);
	
	printEven(arr, size);
	printOdd(arr, size);
}