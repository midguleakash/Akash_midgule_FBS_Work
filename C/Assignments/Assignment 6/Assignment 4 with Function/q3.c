/*3. Print perfect numbers in the given range 1 to n.
*/

void printperfect(int n){
	for(int i=1 ; i <= n ; i++) {
		int no = i ;
		int sum = 0 ;
	
		for(int j = 1 ; j <= no / 2 ; j++){
			if(no % j == 0) {
				sum = sum + j ;
			}
		}
		
		if(sum == no){
			printf("%d   ", no);
		}
	}
}


void main() {
	
	int n ;
	printf("enter number : ");
	scanf("%d" , &n);
	
	printperfect(n);
	
	
}