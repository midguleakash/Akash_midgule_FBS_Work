// Find sum of all numbers.

void main() {
	int arr[6] = {2,5,8,4,6,0};
	
	int size = sizeof(arr) / sizeof(arr[0]);
	
	int sum = 0 ;
	
	for(int i=0 ; i < size ; i++){
		sum = sum + arr[i];
		
	}
	
	printf("sum of all element in array is : %d  ", sum);
	
} 
  
                            
 
                                     