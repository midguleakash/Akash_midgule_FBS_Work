// Write a program to scan string from user then scan a single character and search it
// in a accepted string.
#include <stdio.h>

void main(){
	char str[50];
	
	printf("Enter string : ");
	scanf("%s", str);
	
	fflush(stdin);
	
	char ch ;
	printf("enter charter you want to search : ");
	scanf("%c", &ch);
	
	int found = 0 ;
	
	for(int i=0; str[i] != '\0'; i++){
		if(str[i] == ch){
			found = 1 ;
			break ;
		}
	}
	
	if(found){
		printf("Character found");
	}
	else {
		printf("Character Not found");
	}
}