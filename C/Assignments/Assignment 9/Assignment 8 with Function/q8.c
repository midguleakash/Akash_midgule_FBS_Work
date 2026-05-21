//Merge two arrays

// Function to take input for array
void create_array(int arr[] ,int size) {
	
	for(int i=0 ; i < size ; i++){
		scanf("%d", &arr[i]); 
	}
}

// Function to print array elements
void print_array(int arr[] , int size){	
	
	for(int i=0 ; i < size ; i++){
		printf("%d   ", arr[i]); 
	}
}

// Function to merge two arrays into third array
void mergr_Array(int merge[] ,int arr1[] ,int arr2[] , int size1, int size2 ) {	
	
	// copy arr1
	for(int i=0 ; i < size1 ; i++){
		merge[i] = arr1[i]; 
	}
	
	// copy arr2
    for(int i = 0; i < size2; i++){
        merge[size1 + i] = arr2[i];
    }
	
}
void main() {
	
	int size1;
    // Input size of first array
    printf("Enter size for 1st array: ");
    scanf("%d", &size1);

    // Declare first array with given size
    int arr1[size1];

    // Input elements of first array
    printf("Enter elements for 1st array:\n");
    create_array(arr1, size1);

    
    int size2;
    // Input size of second array
    printf("Enter size for 2nd array: ");
    scanf("%d", &size2);

    // Declare second array with given size
    int arr2[size2];

    // Input elements of second array
    printf("Enter elements for 2nd array:\n");
    create_array(arr2, size2);

    
    // Total size of merged array
    int total_size = size1 + size2;

    // Declare merged array
    int merge[total_size];

    // Call function to merge arrays
    mergr_Array(merge, arr1, arr2, size1, size2);

    
    // Print first array
    printf("\nPrinting 1st array: ");
    print_array(arr1, size1);

    // Print second array
    printf("\nPrinting 2nd array: ");
    print_array(arr2, size2);

    // Print merged array
    printf("\nPrinting merged array: ");
    print_array(merge, total_size);
	
	
}