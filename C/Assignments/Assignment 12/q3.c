// WAP to Remove the nth Index Character from a Non-Empty String

#include <stdio.h>

void removeCh(char str[], int index){
	
	
	if(index < 0 || index >= strlen(str)){
		printf("\nInvalid Index\n");
		return ;
	}
	
	int i = index ;
	while(str[i] != '\0') {
		str[i] = str[i+1];
		i++ ;
	}
	
	str[i] = '\n';
	
}

void main() {
	char str[50];
	
	printf("Enter string : ");
	scanf("%s" , str);
	
	fflush(stdin);
	int index;
	printf("enter index where chartcher you want to remove from string : ");
	scanf("%d" , &index);
	
	printf("string before remove charter\n");
	printf("%s" , str);
	
	removeCh(str, index);
	
	printf("\nstring after remove charter\n");
	printf("%s" , str);
}