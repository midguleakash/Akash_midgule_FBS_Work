// Find sum of all numbers.

int sum(int arr[], int size){
	int sum = 0 ;
	
	for(int i=0 ; i < size ; i++){
		sum = sum + arr[i];
		
	}
	return sum;
}

void main() {
	int arr[6] = {2,5,8,4,6,0};
	
	int size = sizeof(arr) / sizeof(arr[0]);
	
	
	
	printf("sum of all element in array is : %d  ", sum(arr, size));
	
} 
  
                            
 
                                     