// WAP Replace all Occurrences of ‘a’ with $ in a String
// using function
#include <stdio.h>


int found(char str[] , char ch){
	for(int i=0; str[i] != '\0'; i++){
		if(str[i] == ch){
			return 1 ;
		}
	}
	
	return 0 ;
}

void replaceCh(char str[] ,char ch1, char ch2){
	
	if(found(str , ch1)){
		for(int i=0; str[i] != '\0'; i++){
			if(str[i] == ch1){
				str[i] = ch2 ;
			}
		}
	}
	else {
		printf("\nreplaceble charcter not in string\n ");
	}
	
	
}

void main() {
	char str[50];
	
	printf("Enter string : ");
	scanf("%s" , str);
	
	fflush(stdin);
	char ch1;
	printf("enter chartcher you want to replace it : ");
	scanf("%c" , &ch1);
	
	fflush(stdin);
	char ch2;
	printf("enter chartcher you want to insert it : ");
	scanf("%c" , &ch2);
	
	printf("string before replace charter\n");
	printf("%s" , str);
	
	replaceCh(str, ch1, ch2);
	
	printf("\nstring after replace charter\n");
	printf("%s" , str);
}