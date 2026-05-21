// String Built-in Functions in C
// use of 21 String Functions

#include<stdio.h>
#include<string.h>

void main(){

    char str1[100] = "Hello";
    char str2[100] = "World";
    char str3[100] = "HELLO WORLD";
    char str4[100] = "hello world";
    char str5[100] = "Programming in C";
    char copy[100];
    char copy2[100];


	// 1. strlen()
    // Used to find length of string
    printf("1. Length of str1 = %lu\n", strlen(str1));

    // 2. strcpy()
    // Used to copy one string into another string
    strcpy(copy, str1);
    printf("2. strcpy = %s\n", copy);

    // 3. strncpy()
    // Used to copy limited characters from one string to another
    strncpy(copy2, str2, 3);
    copy2[3] = '\0';
    printf("3. strncpy = %s\n", copy2);

    // 4. strcat()
    // Used to concatenate (join) two strings
    strcat(str1, str2);
    printf("4. strcat = %s\n", str1);

    // 5. strncat()
    // Used to concatenate limited characters
    char s1[100] = "Good";
    strncat(s1, "Morning", 4);
    printf("5. strncat = %s\n", s1);

    // 6. strcmp()
    // Used to compare two strings
    printf("6. strcmp = %d\n", strcmp("abc", "abc"));

    // 7. strncmp()
    // Used to compare limited characters of two strings
    printf("7. strncmp = %d\n", strncmp("abcd", "abcf", 3));

    // 8. strchr()
    // Used to find first occurrence of character in string
    printf("8. strchr = %s\n", strchr(str5, 'g'));

    // 9. strrchr()
    // Used to find last occurrence of character in string
    printf("9. strrchr = %s\n", strrchr(str5, 'g'));

    // 10. strstr()
    // Used to find substring inside string
    printf("10. strstr = %s\n", strstr(str5, "in"));

    // 11. strtok()
    // Used to split string into tokens
    char tokenStr[100] = "C,Java,Python";
    char *token = strtok(tokenStr, ",");

    printf("11. strtok:\n");

    while(token != NULL){
        printf("%s\n", token);
        token = strtok(NULL, ",");
    }

    // 12. memset()
    // Used to fill memory with specific character
    char arr1[10] = "abcdef";
    memset(arr1, '*', 3);
    printf("12. memset = %s\n", arr1);
    
    /// 13. memcpy()
    // Used to copy memory block
    char src1[] = "Copy";
    char dest1[20];
    memcpy(dest1, src1, strlen(src1)+1);
    printf("13. memcpy = %s\n", dest1);
    
    // 14. memmove()
    // Used to move memory safely even if overlap occurs
    char arr2[20] = "123456";
    memmove(arr2+3, arr2, 4);
    printf("14. memmove = %s\n", arr2);
    
    
    
    // 15. memcmp()
    // Used to compare memory blocks
    printf("15. memcmp = %d\n", memcmp("abc", "abc", 3));

    // 16. memchr()
    // Used to search character in memory block
    printf("16. memchr = %s\n", memchr(str5, 'm', strlen(str5)));

    // 17. strspn()
    // Used to count matching characters from beginning
    printf("17. strspn = %lu\n", strspn("abcde123", "abcde"));

    // 18. strcspn()
    // Used to count non-matching characters from beginning
    printf("18. strcspn = %lu\n", strcspn("abc123", "123"));

    // 19. strpbrk()
    // Used to find first matching character from another string
    printf("19. strpbrk = %s\n", strpbrk("hello", "xyzle"));

    // 20. strerror()
    // Used to display error message
    printf("20. strerror = %s\n", strerror(2));

    // 21. strdup()
    // Used to duplicate string dynamically
    char *dup = strdup("Duplicate String");
    printf("21. strdup = %s\n", dup);
    
    
    
    
    
    
    

}