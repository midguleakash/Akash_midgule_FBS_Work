

void display(int* ptr , int size);

void main () {
	int arr[5] = {1,2,3,4,5};
	int brr[7] = {11,12,13,14,15,16,17};
	int crr[10] = {21,22,23,24,25,26,27,28,29,30};
	
	display(arr , 5);	
	printf("\n");
	
	display(brr , 7);	
	printf("\n");
	
	display(crr , 10);
}

void display(int* ptr , int size) {
	for(int i=0 ; i < size ; i++) {
		printf("%d  ", ptr[i]);
	}
}