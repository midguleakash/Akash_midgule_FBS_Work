//Calculating total salary based on basic. If basic <=5000 da, ta and hra will be
//10%,20% and 25% respectively otherwise da, ta and hra will be 15%,25% and 30%
//respectively.

void calculate() {
	float basic , da, ta, hra , salary ;
	
	printf("enter basic salary : ");
	scanf("%f", &basic);
	
	if(basic <= 5000) {
		da =(basic * 10 /100);
		ta = (basic * 20 /100);
		hra = (basic * 25 /100);
		
		salary = basic + da + ta + hra ;
		
		printf("salary is %f" , salary);
		
		
	}
	
	else {
		da =  (basic * 15 /100);
		ta =  (basic * 25 /100);
		hra =   (basic * 30 /100);
		
		salary = basic + da + ta + hra ;
		
		printf("salary is %f" , salary);
	}
}


void main() {
	calculate();
}