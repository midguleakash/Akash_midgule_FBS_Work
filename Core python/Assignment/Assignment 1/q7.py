# Program to Find the Roots of a Quadratic Equation 

# quadratic equation ax² + bx + c = 0
#root are   x1 = (-b + √(b² - 4ac)) / 2a  x2 = (-b - √(b² - 4ac)) / 2a
#Discriminant: D = b² - 4ac

#take input of a,b,c
a = float(input("enter a : "))
b = float(input("enter b : "))
c = float(input("enter c : "))

# calculate D
D = b * b - 4*a*c

# Calculate root x1 and x2
x1 = (-b + D ** 0.5) / 2*a
x2 = (-b - D ** 0.5) / 2*a

# print root x1 and x2
print(f'x1 is : {x1} and x2 is : {x2}')
