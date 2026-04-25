# 1. Write a program to check if the given number is positive or negative.

# take input n
n = int(input("enter the number : "))

# print output base on condition
if(n > 0):
    print(f'{n} is positive . ')
elif(n<0):
    print(f'{n} is negative')
else:
    print(f'{n} is 0')
