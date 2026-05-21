# multiplication table for 2

for i in range(2,21,2):
    print(i)


for i in range(1,11):
    print(2*i)

n = int(input("enter number : "))

for i in range(n,n*10+1,n):
    print(i)

for i in range(1,11):
    print(f'{n} * {i}   : {n*i}')