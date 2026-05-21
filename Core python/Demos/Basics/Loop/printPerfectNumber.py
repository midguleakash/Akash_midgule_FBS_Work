n = int(input("enter how many print perfect number : "))



for i in range(1,n):
    sum = 0
    for j in range(1,i):
        if(i % j == 0):
            sum = sum + j

    if(i == sum):
        print(f'{i}')
