/* Print armstrong numbers in the given range 1 to n.
*/


void main() {
	
	int n ;
	printf("enter number : ");
	scanf("%d" , &n);
	
	
	for(int i=1 ; i <= n ; i++) {
		// count the total digit
		int count = 0 ; 
		int temp = i ;
		while(temp > 0) {
			temp = temp / 10 ;
			count ++ ;
		}
		
		//calculate  sum
		temp = i ;
		int sum = 0 ;
		while(temp > 0 ) {
			int	digit = temp % 10 ;
			sum = sum + pow(digit , count);
			temp = temp / 10 ;
		}
		
		
		if(sum == i){
			printf("%d   ", i);
		}
		
		
		
	}
	
	
	
}