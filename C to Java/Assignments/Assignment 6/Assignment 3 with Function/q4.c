/* Check the given number is prime or not.
Input: n = 7
Output: Prime  */

int prime(int n){
	int flag = 1 ;
	
	if(n <= 1) {
		return 0 ;
	}
	for(int i = 2 ; i < n ; i++) {
		if(n % i == 0) {
			return 0 ;
			break ;
		}
	}
	
	return 1 ;
}

void main() {
	
	if(prime(7)) {
		printf("is prime") ;
	}
	
	else {
		printf("is not prime") ;
	}
}