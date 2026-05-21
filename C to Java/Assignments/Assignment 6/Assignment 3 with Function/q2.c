/* Print table for given number.
Input: n = 5
Output: 5 10 15 20 25 30 35 40 45 50 */

void table(int n){
	int  i = 1;
	while(i <= 10) {
		
		n = 5*i ;
		printf("%d  ", n);
		i++ ;
	}
}

void main() {
	table(6);
}