/* 3. Print an inverted right-angled triangle pattern
Input: n = 5
Output:

*****
****
***
**
*

*/

void main() {
	
	int n ;
	printf("enter n : ");
	scanf("%d", &n);
	
	for(int i = 1 ; i <= n ; i++){
		for(int j=1 ; j <= n - i+1 ; j++){
			printf("* ");
		}
		printf("\n");
	}
}