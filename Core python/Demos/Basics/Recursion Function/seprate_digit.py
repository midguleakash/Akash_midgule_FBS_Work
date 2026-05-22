# separate digit from numbers

def sep(n):

    if(n < 0):
        n = -n

    if(n == 0): 
        return 
    
    if(n > 0):
        digit = n % 10    
        print(digit , end=' ')

        sep(n // 10)

n = int(input("enter number : "))
print(f'digit are : ')

if(n==0):
    print(0)

else:
    sep(n)