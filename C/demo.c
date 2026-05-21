

void printPrime(int arr[] , int size) {
	
	for (int i = 0 ; i < size ; i++) {
		
		int flag = 1 ;
		
		if (arr[i] <= 1 ) {
			flag = 0 ;
		}
		
		for(int j = 2 ; j < arr[i] ; j++ ){
			
			if(arr[i] % j == 0) {
				flag = 0 ;
				break ;
			}
		}
		
		if(flag) {
			printf("%d ", arr[i]);
		}
		
		
	}
	
}

void main() {
	int arr[7] = {2,3,5,8,9,7,15};
	int size = sizeof(arr) / sizeof(arr[0]);
	
	printPrime(arr, size);
}