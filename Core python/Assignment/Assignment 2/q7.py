# Find the sum of three-digit number.

# take 3 digit input number
n = int(input("enter three digit number : "))

# calculate last digit after iteration
d1 = n % 10
n = n // 10

d2 = n % 10
n = n // 10   # give as a last digit

d3 = n % 10

# calculate sum
sum = d1 + d2 + d3 

# print sum
print(f'sum of three-digit number is {sum} ')