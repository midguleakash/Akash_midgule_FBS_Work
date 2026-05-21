/*
8. Print a pattern of stars in diamond shape
Input: n = 4
Output:

   *
  * *
 * * *
* * * *
 * * *
  * *
   *

*/


void main() {
	
	int n ;
	printf("enter n : ");
	scanf("%d", &n);
	
	
	// for first half
	for(int i = 1 ; i <= n ; i++){
		
		// print space
		for(int k = 1 ; k <= n-i ; k++){
			printf(" ");
		}
		
		for(int j=1 ; j <= i ; j++){
			printf("* ");
		}
		printf("\n");
	}
	
	
	
	// for second half
	for(int i = 1 ; i <= n ; i++){
		
		// print space
		for(int k = 1 ; k <= i ; k++){
			printf(" ");
		}
		
		for(int j=1 ; j <= n - i  ; j++){
			printf("* ");
		}
		printf("\n");
	}
	
	
	
	
}