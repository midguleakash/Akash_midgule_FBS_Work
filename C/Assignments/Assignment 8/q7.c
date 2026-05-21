//Take two array and add sum in third array
//
//Example-
//arr[5]= {1,2, 3, 4,5}
//
//brr[5]={10,20,30, 40, 50}
//crr[5]={11,22,33,44,55}


// declare function for some and print
void sum_print(int arr[] , int brr[] , int crr[] , int size){
	for(int i=0 ; i < size ; i++) {
		crr[i] = arr[i] + brr[i] ;
		printf("%d   " , crr[i]);
	}
}


void main() {
	int arr[5]= {1,2, 3, 4,5};

	int brr[5]={10,20,30, 40, 50};
	int crr[5];
	

	sum_print(arr , brr, crr,5);
	
}