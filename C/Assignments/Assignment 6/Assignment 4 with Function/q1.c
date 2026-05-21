/* Print armstrong numbers in the given range 1 to n.
*/

int count(int n){
	int count = 0 ;
	while(n > 0) {
		n = n / 10;
		count ++ ;
	}
	
	return count ;
}

int power(int n , int count){
	int power=1;
	for(int i=1; i <= count; i++){
		power = n * power ;
	} 
	
	return power ;
}

void armstrong(int n) {
	for(int i = 1 ; i <= n ; i++){
		
		int sum = 0 ;
		int temp = i ;
		
		int cnt = count(i);
			while(temp > 0 ) {
				int	digit = temp % 10 ;
				sum = sum + pow(digit , cnt);
				temp = temp / 10 ;
			}
		
		if(i == sum){
			printf("%d ", i);
		}
	}
}

void main() {
	int n ;
	printf("enter range n : ");
	scanf("%d", &n);
	armstrong(n);
	
}