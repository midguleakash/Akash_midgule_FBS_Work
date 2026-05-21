// Write a program to check whether a given character is uppercase or lowercase.

void main() {
	
	char ch ;
	
	printf("enter charchter : ");
	scanf("%c", &ch);
	
	if (ch >= 'A' && ch <='Z'){
		printf("Uppercase");
	}
	
	else if(ch >= 'a' && ch <= 'z'){
		printf("lowercase");
	}
	
	else {
		printf("it not a charcter");
	}
}