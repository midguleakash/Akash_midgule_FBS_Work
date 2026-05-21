/* Print prime numbers in the given range 1 to n.
*/

void printprime(int n) {
	for(int i=1 ; i <= n ; i++) {
		int no = i ;
		int prime = 1 ;
		
		if(no <= 1 ) {
			prime = 0 ;
		}
		for(int j = 2 ; j <= i /2 ; j++){
			if(no % j == 0) {
				prime = 0 ;
				break ;
			}
		}
		
		if(prime){
			printf("%d   ", i);
		}
		
	}
}

void main() {
	
	int n ;
	printf("enter number : ");
	scanf("%d" , &n);
	
	printprime(n);
	
}