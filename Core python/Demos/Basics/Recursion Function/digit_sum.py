# separate digit sum from numbers

def sum(n):

    if(n < 0):
        n = -n

    if(n == 0): 
        return 0
    
    if(n > 0):
        digit = n % 10    
   
        return digit + sum(n // 10)

n = int(input("enter number : "))


if(n==0):
    print('sum is: ' , 0)

else:
    print(f'sum is: {sum(n)}')