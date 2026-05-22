# sum using recursion function

def add(n):
    if(n <= 0):
        return n
    
    return n + add(n-1)

n = int(input("enter number : "))
print(f'sum is : {add(n)}')