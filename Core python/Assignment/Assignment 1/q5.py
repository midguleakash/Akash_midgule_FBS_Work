# Write a program to enter P, T, R and calculate Compound Interest.

# take input of P, T, R 
p = int(input("enter Principle : "))
t = int(input("Enter time : "))
r = int(input("enter rate : "))

# calculate Amount
A =  p * (1 + r/100) ** t

# Calculate compound Intrest
CI = A - p

# print amount
print(f'Amount is : {A}')

# Print compound interest
print(f'Print compound interest : {CI}')