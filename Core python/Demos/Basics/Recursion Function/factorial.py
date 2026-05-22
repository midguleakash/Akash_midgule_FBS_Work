# program for calculate factorial using recursion



def fact(n):
    if(n == 0):
        return 1    
    
    return n * fact(n-1)

n = int(input("enter number : "))
print(f'fact is : {fact(n)}')