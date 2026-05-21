/* Sum of numbers in given range.
Find sum of numbers from start to end.
Input: start = 1, end = 5
Output: 15  */

void sum(int start, int end){
	int sum = 0;
	while(start <= end) {
		sum = sum + start ;
		start++ ;
	}
	
	printf("sum is : %d", sum);
}

void main(){
	sum(1,5);
}

