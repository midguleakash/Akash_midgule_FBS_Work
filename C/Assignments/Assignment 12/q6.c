// WAP to Take in a String and Replace Every Blank Space with special symbol.

void replaceBS(char str[] , char symbol){
	for(int i=0 ; str[i] != '\0' ; i++){
		if(str[i] == ' '){
			str[i] = symbol ;
		}
	}
}

int main() {
	char str[50];
	
	printf("Enter string : ");
	scanf("%[^\n]" , str);
	
	char symbol = '#' ;
	
	printf("string before Replace Every Blank Space\n");
	printf("%s" , str);
	
	replaceBS(str , symbol);
	
	printf("\nstring after Replace Every Blank Space\n");
	printf("%s" , str);
	
	
	
	return 0 ;
}