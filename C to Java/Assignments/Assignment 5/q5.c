/* 5. Print an inverted pyramid pattern
Input: n = 5
Output:

* * * * *
 * * * *
  * * *
   * *
    *

*/


void main() {
	
	int n ;
	printf("enter n : ");
	scanf("%d", &n);
	
	for(int i = 1 ; i <= n ; i++){
		
		
		
		// print spacce 
		int space = i-1 ;
		for(int j=1 ; j <= space ; j++){
			printf(" ");
		}
		
		for(int k=1 ; k <= n-i+1 ; k++){
			printf("* ");
		}
		
		printf("\n");
	}
}