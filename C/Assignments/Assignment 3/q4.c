/* Check the given number is prime or not.
Input: n = 7
Output: Prime  */

void main() {
	int n = 7 ,flag = 1 ;
	
	if(n <= 1) {
		flag = 0 ;
	}
	for(int i = 2 ; i < n ; i++) {
		if(n % i == 0) {
			flag = 1 ;
			break ;
		}
	}
	
	
	if(flag) {
		printf("is prime") ;
	}
	
	else {
		printf("is not prime") ;
	}
}