// Accept array and print only prime numbers of array.

int main() {
	
	
	// declare array
	int arr[10];

// take value of array from user
for(int i=0 ; i < 10 ; i++){
	printf("\nenter %dth element of array : ",i);
	scanf("%d",&arr[i]);
};


// print prime numbers from array
printf("\nprime numbers of array : ");

for(int i=0 ; i < 10 ; i++){
	int flag = 1 ;
	if(arr[i] <= 1){
            flag = 0;   
            
        }
	for(int j=2 ; j < arr[i] ; j++){
		if(arr[i] % j == 0 ){
			flag = 0;
			break ;
		} 
	}
	
	if(flag) {
		printf("%d  ",arr[i]);
	}
}
	
}
