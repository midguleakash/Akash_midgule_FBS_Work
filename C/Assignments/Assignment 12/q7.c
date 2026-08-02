// WAP to Remove the Characters of Odd Index Values in a String





void main() {
	char str[50];
	char newStr[30];
	
	printf("Enter string : ");
	scanf("%s" , str);
	
	printf("string before Remove the Characters of Odd Index Values\n");
	printf("%s" , str);
	
	int j=0;
	
	for(int i=0 ; str[i] != 0 ; i++){
		if(i % 2 == 0){
			newStr[j] = str[i];
			j++ ;
		}
	}
	
	newStr[j] = '\0';
	
	
	printf("\nstring after Remove the Characters of Odd Index Values\n");
	printf("%s" , newStr);
}

