// WAP to Count the Number of Vowels in a String

int countVowels(char str[]){
	int count = 0 ;
	
	for(int i=0 ; str[i] != '\0' ; i++){
		if(str[i] == 'a' || str[i] == 'A' || str[i] == 'e' || str[i] == 'E' || str[i] == 'i' || str[i] == 'I' || str[i] == 'o' || str[i] == 'O' || str[i] == 'u' || str[i] == 'U' )
		count ++ ;
	}
	
	return count ;
	
}

void main(){
	char str[50];
	
	printf("Enter string : ");
	scanf("%s" , str);	
	
	countVowels(str);
	
	printf("\nstring after Exchanged charter\n");
	printf("count of Vowels : %d" , countVowels(str));
}