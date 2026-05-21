/* Check the given number is Perfect number or not.
Input: n = 28
Output: Perfect 

A Perfect Number is a number that is equal to the sum of its proper divisors (excluding the number itself).

Example 2: 28

Factors: 1, 2, 4, 7, 14

Sum: 1 + 2 + 4 + 7 + 14 = 28

So, 28 is also a Perfect Number */

void main() {
	int n ;
	printf("enter number : ");
	scanf("%d" , &n);
	
	int sum = 0 ;
	
	for(int i = 1 ; i <= n / 2 ; i++){
		if(n % i == 0) {
			sum = sum + i ;
		}
	}
	
	if(sum == n){
		printf("Perfect number");
	}
	
	else {
		printf("not Perfect number");
	}
}


