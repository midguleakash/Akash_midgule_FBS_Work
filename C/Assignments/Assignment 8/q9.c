//Reverse the given array.


// Function to print array elements
void print_array(int arr[] , int size){	
	
	
	for(int i=0 ; i < size ; i++){
		printf("%d   ", arr[i]); 
	}
	
	printf("\n");
}

// function for reverse array
void reverse(int arr[], int size){
	int start = 0 , end = size - 1 ;
	
	while(start < end) {
		int temp = arr[start] ;
		arr[start] = arr[end] ;
		arr[end] = temp ;
		
		start++ ;
		end-- ;
	}
}


void main() {
	
	int arr1[10] = {1,2,3,4,5,6,7,8,9,10};
	int arr2[9] = {1,2,3,4,5,6,7,8,9};
	
	// print even original array
	print_array(arr1 , 10);
	
	
	// reverse and print even  array
	reverse(arr1 , 10) ;
	print_array(arr1 , 10);
	
	
	// print odd original array
	print_array(arr2 , 9);
	
	
	// reverse and print odd  array
	reverse(arr2 , 9) ;
	print_array(arr2 , 9);
	
	
}