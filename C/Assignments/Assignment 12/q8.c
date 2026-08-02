// WAP to Calculate the Number of Words Present in a String

int countWord(char str[]){
	
	int count = 0;
	
	for(int i=0 ; str[i] != '\0' ; i++){
		if(str[i] == ' '){
			count ++ ;
		}
	}
	
	return count+1 ;
}

int main() {
	char str[50];
	
	printf("Enter string : ");
	scanf("%[^\n]" , str);
	
	printf("count of word is : %d", countWord(str));	
	
	return 0 ;
}