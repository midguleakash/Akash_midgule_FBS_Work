//4. Write a C program to swap two numbers using a temporary third variable.

void main() {
    int a = 10;
    int b = 20;
    
    printf("a and b before swap \n a is %d  b is %d", a, b);
    
    
    int c= a ;
    a = b ;
    b = c ;
    
    printf("\n a and b after swap \n a is %d  b is %d", a, b);
}
