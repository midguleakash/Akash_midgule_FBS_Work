//1. Find minimum and maximum number in array.

int max(int arr[], int size){
	int max = arr[0] ;
	
	for(int i=0 ; i < size ; i++){
		if(arr[i] > max) {
			max = arr[i];
		}
	}
	
	return max ;
}


int min(int arr[], int size){
	int min = arr[0];
	
	for(int i=0 ; i < size ; i++){		
		if(arr[i] < min) {
			min = arr[i];
		}
	}
	
	return min ;
}


void main() {
	int arr[6] = {2,5,8,4,6,0};
	int size = sizeof(arr) / sizeof(arr[0]);
	
	printf("max element is %d  ", max(arr, size));
	printf("\n min element is %d ", min(arr, size));
}