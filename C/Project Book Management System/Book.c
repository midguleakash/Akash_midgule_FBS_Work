
// Book Managenent System

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>


// create book structure
typedef struct Book {
	int id;
	char name[50];
	char author[50];
	char category[40];
	float price;
	float rating;
	
}Book;


// Initial size of dynamic array
int size=3;

// Pointer for dynamic array of books
Book* books=NULL;

// Stores current number of books
int count = 0 ;


// Function to validate text input for add - name, author, category
// Allows only alphabets and spaces
int isValidText(char str[]) {
    for(int i = 0; str[i] != '\0'; i++) {
        if(!(isalpha(str[i]) || str[i] == ' ')) {
            return 0;
        }
    }
    return 1;
}

// Function to validate Book ID
// Checks:
// 1. Only digits allowed
// 2. ID must be greater than 0
// 3. Duplicate IDs not allowed
int isValidId(char str[]) {
    for(int i = 0; str[i] != '\0'; i++) {
        if(str[i] == '-' && i == 0) {
            continue;
        }

        if(!isdigit(str[i])) {

            printf("\nInvalid ID! Only numbers allowed.\n");
            return 0;
        }
    }

    int id = atoi(str);
    if(id <= 0) {
        printf("\nEnter id greater than 0\n");
        return 0;
    }

    for(int i = 0; i < count; i++) {
        if(id == books[i].id) {
            printf("\nThis Book ID is exist\nEnter unique id for this book\n");
            return 0;
        }
    }

    return 1;
}

// Function to validate price
// Price must contain only numbers
// and should be greater than 0
int isValidPrice(char str[]){
	for(int i = 0; str[i] != '\0'; i++) {
        if(str[i] == '-' && i == 0) {
            continue;
        }

        if(!isdigit(str[i])) {
            printf("\nInvalid Price! Only numbers allowed.\n");
            return 0;
        }
    }
    
    int price = atoi(str);    
    if (price <= 0 ) {
    	printf("\nEnter price greater than 0\n");
		return 0;
	}	
	
	return 1 ;
}

// Function to validate rating
// Rating must be between 1 to 5
int isValidRating(char str[]) {
	for(int i = 0; str[i] != '\0'; i++) {
        if(str[i] == '-' && i == 0) {
            continue;
        }
        if(!isdigit(str[i])) {
            printf("\nInvalid Rating! Only numbers allowed.\n");
            return 0;
        }
    }
    
    int rating = atoi(str);    
    if(rating >=1 && rating <=5) {		
	}	
	else {
		printf("\nEnter rating between 1 to 5");
		return 0;
	}	
	
	return 1 ;
}


// Function to add new book
int addBook() {
	
	// Reallocate memory if array becomes full
	if(count>=size){
		printf("\n reallocation  started : ");
		int newsize=size*2;
		books = realloc(books , newsize * sizeof(Book));
		size=newsize;
		}
	
	// Temporary string to validate ID input
	char tempID[20];	
	
	// Take valid Book ID from user
	while(1) {
		printf("\nEnter Book ID : ");
    	scanf("%s", tempID);
    	int id = atoi(tempID);
    	books[count].id = id;
		
		if(isValidId(tempID)) {
        	break;
    	}		
	}	
	
	// Take valid Book Name
	while(1) {
		fflush(stdin);
	    printf("Enter Book NAME : ");
	    scanf(" %[^\n]", books[count].name);
	
	    if(isValidText(books[count].name)) {
	        break;
	    }	
	    printf("Invalid input! Only alphabets allowed.\n");
	}
	
	// Take valid Author Name
	while(1) {
		fflush(stdin);
	    printf("Enter Book AUTHOR : ");
	    scanf(" %[^\n]", books[count].author);
	
	    if(isValidText(books[count].author)) {
	        break;
	    }
	
	    printf("Invalid input! Only alphabets allowed.\n");
	}
	
	// Take valid Category Name
	while(1) {
		fflush(stdin);
	    printf("Enter Book category : ");
	    scanf(" %[^\n]", books[count].category);
	
	    if(isValidText(books[count].category)) {
	        break;
	    }
	
	    printf("Invalid input! Only alphabets allowed.\n");
	}	
	
	// Take valid Book Price
	char tempPrice[20];
	while(1){
		printf("\nEnter Book price : ");
		scanf("%s", tempPrice);
    	int price = atoi(tempPrice);
    	books[count].price = price;
    	
    	if(isValidPrice(tempPrice)) {
        	break;
    	}
    	
	}
	
	// Take valid Book Rating
	char tempRating[20];
	while(1){
		printf("\nEnter Book rating : ");
		scanf("%s", tempRating);
    	int rating = atoi(tempRating);
    	books[count].rating = rating;
    	
    	if(isValidRating(tempRating)) {
        	break;
    	}
    	
	}
	
	printf("\nBook Added Successfully");	
	count++;
}

// Function to display all books
void displayAll()  {
	
	if(count == 0) {
        printf("\nNo books available!\n");       
		return; 
    }
	for(int i=0 ;i < count ; i++) {	
		printf("\nBook ID : %d\n",books[i].id);
		printf("Book Name : %s\n",books[i].name);
		printf("Book Author : %s\n",books[i].author);		
		printf("Book category : %s\n",books[i].category);		
		printf("Enter Book price : %f\n",books[i].price);		
		printf("Enter Book rating : %f\n\n",books[i].rating);	
		
	}
}

// Search book using Book ID
void searchID() {
	if(count == 0) {
        printf("\nNo books available for search!\n");       
		return; 		
    }
    
    int id;
    printf("Enter book id that you want to search : ");
    scanf("%d",&id);
    int found = 1 ;
    for(int i=0 ;i < count ; i++) {	
    	if(id == books[i].id){
    		found= 0 ;
    		printf("\nBook Found\n");
    		printf("\nBook ID : %d\n",books[i].id);
			printf("Book Name : %s\n",books[i].name);
			printf("Book Author : %s\n",books[i].author);		
			printf("Book category : %s\n",books[i].category);		
			printf("Enter Book price : %f\n",books[i].price);		
			printf("Enter Book rating : %f\n\n",books[i].rating);
    		
		}			
	}
	
	if(found){
		printf("\nNo books found of this id : %d \n",id);     
	}
}

// Search book using Book Name
void searchName() {
	if(count == 0) {
        printf("\nNo books available for search!\n");       
		return; 		
    }
    
    char name[50];
    printf("Enter book name that you want to search : ");
    scanf("%s",name);
    int found = 1 ;
    for(int i=0 ;i < count ; i++) {	
    	if(strcmp(name, books[i].name) == 0){
    		found= 0 ;
    		printf("\nBook Found\n");
    		printf("\nBook ID : %d\n",books[i].id);
			printf("Book Name : %s\n",books[i].name);
			printf("Book Author : %s\n",books[i].author);		
			printf("Book category : %s\n",books[i].category);		
			printf("Enter Book price : %f\n",books[i].price);		
			printf("Enter Book rating : %f\n\n",books[i].rating);
    		
		}			
	}
	
	if(found){
		printf("\nNo books found of this name : %s \n",name);     
	}
}

// Display all books of entered author
void authorBooks() {
	if(count == 0) {
        printf("\nNo books available for search!\n");       
		return; 		
    }
    
    char name[50];
    printf("Enter auhor name that you want to search of its  book : ");
    scanf("%s",name);
    int found = 1 ;
    for(int i=0 ;i < count ; i++) {	
    	if(strcmp(name, books[i].author) == 0){
    		found= 0 ;
    		printf("\n%dth Book Found of enterd author\n",i);
    		printf("\nBook ID : %d\n",books[i].id);
			printf("Book Name : %s\n",books[i].name);
			printf("Book Author : %s\n",books[i].author);		
			printf("Book category : %s\n",books[i].category);		
			printf("Enter Book price : %f\n",books[i].price);		
			printf("Enter Book rating : %f\n\n",books[i].rating);
    		
		}			
	}
	
	if(found){
		printf("\nNo books found of this name of author : %s \n",name);     
	}
}

// Display all books of entered category
void categoryBooks() {
	if(count == 0) {
        printf("\nNo books available for search!\n");       
		return; 		
    }
    
    char name[50];
    printf("Enter category name that you want to search of its  book : ");
    scanf("%s",name);
    int found = 1 ;
    for(int i=0 ;i < count ; i++) {	
    	if(strcmp(name, books[i].category) == 0){
    		found= 0 ;
    		printf("\n%dth Book Found of enterd category\n",i);
    		printf("\nBook ID : %d\n",books[i].id);
			printf("Book Name : %s\n",books[i].name);
			printf("Book Author : %s\n",books[i].author);		
			printf("Book category : %s\n",books[i].category);		
			printf("Enter Book price : %f\n",books[i].price);		
			printf("Enter Book rating : %f\n\n",books[i].rating);
    		
		}			
	}
	
	if(found){
		printf("\nNo books found of this name of category : %s \n",name);     
	}
}

// Update book price or rating
void updateBooks() {
	if(count == 0) {
        printf("\nNo books available for update!\n");       
		return; 		
    }
    
    int id;
    printf("Enter book id that you want to update : ");
    scanf("%d",&id);
    
    int found = 1 ;
    int position_of_book;
    for(int i=0 ;i < count ; i++) {	
    	if(id == books[i].id){
    		position_of_book = i ;
    		found= 0 ;
    		printf("\nBook Found\n");
    		printf("\nBook ID : %d\n",books[i].id);
			printf("Book Name : %s\n",books[i].name);
			printf("Book Author : %s\n",books[i].author);		
			printf("Book category : %s\n",books[i].category);		
			printf("Enter Book price : %f\n",books[i].price);		
			printf("Enter Book rating : %f\n\n",books[i].rating);
			
		}
	}
	
	if(found) {
		printf("\nNo books found of this id : %d \n",id);
	}
	
	else {
		
		int choice ;
	
	    printf("Press 1 : Change price of book\n");
		printf("Press 2 : Change rating of book\n");
		printf("\nEnter choice : ");
		scanf("%d", &choice);
		
		switch(choice){
			case 1:{
				char tempPrice[20];
				while(1){
					printf("\nEnter price of book that you want to updae : ");
					scanf("%s", tempPrice);
			    	int price = atoi(tempPrice);
			    	books[position_of_book].price = price;
			    	
			    	if(isValidPrice(tempPrice)) {
			        	break;
			    	}			    	
				}
				break;
				
//				int price ;
//				printf("Enter price of book that you want to updae : ");
//				scanf("%d", &price);
//				books[position_of_book].price = price ;
//				break;
			}
				
				
			case 2:{
				char tempRating[20];
				while(1){
					printf("\nEnter Book rating : ");
					scanf("%s", tempRating);
			    	int rating = atoi(tempRating);
			    	books[position_of_book].rating = rating;
			    	
			    	if(isValidRating(tempRating)) {
			        	break;
			    	}
				}
				break;
				
//				int rating ;
//				printf("Enter rating of book that you want to updae : ");
//				scanf("%d", &rating);
//				books[position_of_book].rating = rating ;
//				break;
			}
				
				
			default :  printf("Invalid choice!\n");
		}
	
	}
    
    
}

// Remove book from strucure array
void removeBook() {
	if(count == 0) {
        printf("\nNo books available for remove!\n");       
		return; 		
    }
    
    int id;
    printf("Enter book id that you want to remove : ");
    scanf("%d",&id);
    
    int found = 1 ;
    
    // Shift elements left after deletion
    for(int i=0 ; i < count ; i++){
    	if(id == books[i].id){
    		found = 0 ;
    		
    		
    		for(int j=i ; j < count - 1 ; j++){
    			books[j]= books[j+1];
			}
			
			count -- ;
			
			books = realloc(books, count * sizeof(Book));
			printf("\nBook deleted successfully!\n");
			break ;
		}
	}
	
	if(found) {
		printf("\nNo books found of this id : %d \n",id);
	}
}

// Sort books by price in descending order
void sortPrice() {
	if(count == 0) {
        printf("\nNo books available for sorted on basis of price!\n");       
		return; 		
    }
    
    
    Book temp[count];
    
    for(int i=0 ; i < count ; i++){
    	temp[i]=books[i];
	}
	
	
	//sort temp array (descending price)
	for(int i=0 ; i < count ; i++){
		for(int j = i + 1; j < count; j++){
			if(temp[i].price < temp[j].price) {
                Book t = temp[i];
                temp[i] = temp[j];
                temp[j] = t;
            }
		}
	}
	
	printf("\n sorted books on basis of price with dereasing order\n");

    for(int i = 0; i < count; i++) {
        printf("\nBook ID : %d\n", temp[i].id);
        printf("Book Name : %s\n", temp[i].name);
        printf("Book Author : %s\n",temp[i].author);
        printf("Book category : %s\n",temp[i].category);	
        printf("Price : %.2f\n", temp[i].price);
        printf("Enter Book rating : %f\n\n",temp[i].rating);
    }
}


// Sort books by rating in descending order
void sortRating() {
	if(count == 0) {
        printf("\nNo books available for sorted on basis of price!\n");       
		return; 		
    }
    
    
    Book temp[count];
    
    for(int i=0 ; i < count ; i++){
    	temp[i]=books[i];
	}
	
	
	//sort temp array (descending price)
	for(int i=0 ; i < count ; i++){
		for(int j = i + 1; j < count; j++){
			if(temp[i].rating < temp[j].rating) {
                Book t = temp[i];
                temp[i] = temp[j];
                temp[j] = t;
            }
		}
	}
	
	printf("\n sorted books on basis of price with dereasing order\n");

    for(int i = 0; i < count; i++) {
        printf("\nBook ID : %d\n", temp[i].id);
        printf("Book Name : %s\n", temp[i].name);
        printf("Book Author : %s\n",temp[i].author);
        printf("Book category : %s\n",temp[i].category);	
        printf("Price : %.2f\n", temp[i].price);
        printf("Enter Book rating : %f\n\n",temp[i].rating);
    }
}

// Main function
int main() { 
	
	int choice ;
	
	// Allocate memory dynamically for books
	books=(Book*)malloc( (size) * sizeof(Book));
	
	do {
		fflush(stdin);
	
		printf("\n\nBook management System\n\n");
		
		printf("Press 1 : Add book\n");
		printf("Press 2 : Diaplay all book\n");
		printf("Press 3 : Remove a book\n");
		printf("Press 4 : Search book by ID \n");
		printf("Press 5 : Search book by Name \n");
		printf("Press 6 : Show Author Books\n");   
		printf("Press 7 : Show Category Books\n");
		printf("Press 8 : Update Book\n");
		printf("Press 9 : Sort by Price\n");
		printf("Enter 10 : Sort by Rating\n");
		printf("Press 0 : Exit\n");
	
		
		printf("\nEnter choice : ");

		if(scanf("%d", &choice) != 1) {

   			 printf("Invalid input! Please enter numbers only.\n");

    		while(getchar() != '\n');

    		continue;
		}
		
		switch(choice) {
			case 1: addBook() ; break;
			case 2: displayAll()  ; break;
			case 3: removeBook(); break;
			case 4: searchID(); break;
			case 5: searchName(); break;
			case 6: authorBooks(); break;
			case 7: categoryBooks(); break;
			case 8: updateBooks(); break;
			case 9: sortPrice(); break;
			case 10: sortRating(); break;
			case 0:printf("Exiting...\n"); break;
			default :  printf("Invalid choice!\n");
		}

	} while(choice != 0);


	// Free dynamically allocated memory
	free(books);
	return 0;	
}



