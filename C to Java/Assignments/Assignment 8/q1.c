//1. Find minimum and maximum number in array.

void main() {
	int arr[6] = {2,5,8,4,6,0};
	
	int size = sizeof(arr) / sizeof(arr[0]);
	
	int max = arr[0] , min = arr[0];
	
	for(int i=0 ; i < size ; i++){
		if(arr[i] > max) {
			max = arr[i];
		}
		
		if(arr[i] < min) {
			min = arr[i];
		}
	}
	
	
	printf("max element is %d : ", max);
	printf("\n min element is %d : ", min);
}