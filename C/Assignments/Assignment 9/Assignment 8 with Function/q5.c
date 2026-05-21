// Print alternate elements in array.

void printAlternate(int arr[], int size){
	printf("alternate elements in array are  : ");
	for(int i=0 ; i < size ; i=i+2){
		printf("%d  " ,arr[i] );
		
	}
}

void main() {
	int arr[6] = {2,5,8,4,6,0};
	int size = sizeof(arr) / sizeof(arr[0]);
	
	printAlternate(arr, size);
	
}