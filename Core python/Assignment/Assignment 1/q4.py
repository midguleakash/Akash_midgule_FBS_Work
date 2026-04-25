# Write a program to enter P, T, R and calculate simple Interest.

# take input of P, T, R 
p = int(input("enter Principle : "))
t = int(input("Enter time : "))
r = int(input("enter rate : "))

# Calculate Simple Intrest
si = (p * r * t) / 100 

# Print simple interest
print(f'Print simple interest : {si}')