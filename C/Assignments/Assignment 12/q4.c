// WAP to Form a New String where the First Character and the Last Character have
// been Exchanged

void exchanged(char str[]){
	char temp = str[0];
	
	str[0] = str[strlen(str) - 1]; 
	str[strlen(str) - 1] = temp ;
}

void main() {
	char str[50];
	
	printf("Enter string : ");
	scanf("%s" , str);
	
	printf("string before Exchanged charter\n");
	printf("%s" , str);
	
	exchanged(str);
	
	printf("\nstring after Exchanged charter\n");
	printf("%s" , str);
}