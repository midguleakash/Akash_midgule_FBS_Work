// Search the given number in array.

void main() {
	int arr[6] = {2,5,8,4,6,0};
	
	int size = sizeof(arr) / sizeof(arr[0]);
	
	int n , index = 0 ;
	printf("enter number that you want to find : ");
	scanf("%d",&n);
	
	for(int i=0 ; i < size ; i++){
		if(arr[i] == n) {
			index = i ;
			break ;
		}
		
		
	}
	
	if(index) {
		printf("number is present in array at index : %d" , index);
	}
	
	else{
			printf("number is not present in array");
		}
		
	
	
	
}