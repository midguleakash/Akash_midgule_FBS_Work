# Write a program to input angles of a triangle and check whether triangle is valid or not.

# take of input of angle of traingle
a = int(input("enter 1st angle : "))
b = int(input("enter 2st angle : "))
c = int(input("enter 3st angle : "))

# calculate angle sum
sum = a+b+c

# print output base on condition
if(sum == 180):
    print(f'is valid traingle')
else:
    print(f'is not valid traingle')