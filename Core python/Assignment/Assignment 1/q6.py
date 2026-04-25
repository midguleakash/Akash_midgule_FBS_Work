# Write a Program to input two angles from user and find third angle of the triangle.

# Take two angle form user
A1 = int(input("Enter first angle : "))
A2 = int(input("Enter second angle : "))

# Calculate third angle
A3 = 180 - A1 - A2

# Print third angle of traingle
print(f'Third angle of traingle is : {A3}')