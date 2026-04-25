# Convert temp from Celsius to Fahrenheit. (C/5 = (F-32)/9)

# take input of temprature
C = float(input("enter temprature in Celcius : "))

# calculate temp in F
F = ( C * 9 / 5) + 32

# print temprature
print(f'temprature in celsius : {F}')