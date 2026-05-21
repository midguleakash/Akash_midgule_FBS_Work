/* 4. Print strong numbers in the given range 1 to n.
*/


void main() {
	
	int n ;
	printf("enter number : ");
	scanf("%d" , &n);
	
	
	for(int i=1 ; i <= n ; i++) {
		int temp = i ;
		int sum = 0;
		while(temp > 0){
			int digit = temp % 10 ;
			temp = temp / 10 ;
			
			int fact = 1 ;
			
			for(int i = 1 ; i <= digit ; i++) {
				fact = fact * i ;
			}
			
			sum = sum + fact ;
			
		}
		
		if(sum == i) {
			printf("%d   ", i);
			
		}
		
		
			
		
		
	}
	
	
	
}