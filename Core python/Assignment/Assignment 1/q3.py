# Program to find quotient and remainder of two numbers.

# take input of dividend and divisior
dividend =  int(input("enter dividend : "))
divisor = int(input("enter divisor : "))

# calculate quotient and remainder
quotient = dividend // divisor
remainder = dividend % divisor

# print quotient and remainde
print(f'quotient is : {quotient}')
print(f'remainder is : {remainder}')