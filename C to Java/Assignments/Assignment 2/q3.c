//Write a program to find greatest of three numbers using nested if-else.


void main() {
	float x,y,z ;
	
	printf("enter 1st number x : " );
	scanf("%f", &x);
	
	printf("enter 1st number y : " );
	scanf("%f", &y);
	
	printf("enter 1st number z : " );
	scanf("%f", &z);
	
	if(x>y){
		if(x>z){
			printf("x : %f is greater", x);
		}
		
		else {
			printf("z : %f is greater",z);
		}
	}
	
	else {
		if(y>z){
			printf("y : %f is greater", y);
		}
		
		else {
			printf("z : %f is greater",z);
		}
	}
}