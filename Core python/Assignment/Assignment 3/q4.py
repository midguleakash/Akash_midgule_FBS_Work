# Write a program to input all sides of a triangle and check whether triangle is valid or not.

# take side input

x = int(input("enter first side : "))
y = int(input("enter 2nd side : "))
z = int(input("enter 3rd side : "))

# print output base on condition
if((x+y > z)  and (y+z > x) and (x+z > y)):
    print(f'trangle is valid')

else:
    print(f'trangle is not valid')