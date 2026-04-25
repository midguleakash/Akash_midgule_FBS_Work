# Write a program to swap two numbers without using third variable.

# take number

x = 10
y = 20

# print numbers before swap
print(f'numbers before swap x : {x} , y : {y}')

# Step 1: Add both numbers and store in y
# Now y contains sum of x and y
y = y + x   

# Step 2: Subtract original x from new y (sum)
# This gives original value of y, assign it to x
x = y - x   

# Step 3: Subtract new x (original y) from y (sum)
# This gives original value of x, assign it to y
y = y - x   

# print numbers after swap
print(f'numbers after swap x : {x} , y : {y}')
