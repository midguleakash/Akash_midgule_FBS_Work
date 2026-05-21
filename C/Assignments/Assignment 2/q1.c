//Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the
//desired operations.

void main() {
	
	float n1 , n2 ,  ans;
	char op ;
	printf("enter 1st number : ");
	scanf("%f", &n1);
	
	printf("enter 2st number : ");
	scanf("%f", &n2);
	
	printf("enter operator (+,-,/,*,'%') : ");
	scanf(" %c", &op);
	
	if(op == '+') {
		ans = n1 + n2 ;
		printf("answer is : %f", ans);
	}
	
	else if(op == '-') {
		ans = n1 - n2 ;
		printf("answer is : %f", ans);
	}
	
	else if(op == '/') {
		ans = n1 / n2 ;
		printf("answer is : %f", ans);
	}
	
	else if(op == '*') {
		ans = n1 * n2 ;
		printf("answer is : %f", ans);
	}
	
	else if(op == '%') {
		ans = (int)n1 % (int)n2 ;
		printf("answer is : %f", ans);
	}
	
	else {
		printf("enter valid operator : ");
	}
}