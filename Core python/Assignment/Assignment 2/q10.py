# 10. Write a program to reverse three-digit number.

# Find the sum of three-digit number.

# take 3 digit input number
n = int(input("enter three digit number : "))

# print number before reverse
print(f'original number is : {n}')

# calculate last digit after iteration
d1 = n % 10
n = n // 10

d2 = n % 10
n = n // 10   # give as a last digit

d3 = n % 10

# calculate reverse number
r = (d1 * 100) + (d2 * 10) + (d3)

# print number after reverse
print(f'reverse number is : {r}')
