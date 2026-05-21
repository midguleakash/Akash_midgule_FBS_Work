//Accept three sides of a triangle from the user and determine whether the triangle is
//equilateral, isosceles, or scalene.

void checkTriangle(){
	float x,y,z ;
	
	printf("enter 1st side : " );
	scanf("%f", &x);
	
	printf("enter 2nd side : " );
	scanf("%f", &y);
	
	printf("enter 3rd side : " );
	scanf("%f", &z);
	
	
	//check traingle is valid or not
	
	// traingle is valid or not
	if((x + y > z) && (y+z > x)  && (x+z > y)) {
		
		// All three sides are equal
		if(x == y  && y == z){
			printf("traingle is equilateral \n");
		}
		
		// Any two sides are equal
		else if(x == y  || y == z  || x==z){
			printf("Triangle is Isosceles");
		}
		
		
		// All sides are different
		else {
			printf("Triangle is Scalene");
		}
	}
	
	else {
		printf("Not a valid triangle");
	}
}


void main() {
	checkTriangle();
	
}