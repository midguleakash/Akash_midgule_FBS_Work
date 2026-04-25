#addition of two numbers

x = int(input("enter first number : "))
y = int(input("enter second numbers : "))

sum = x+y

print("sum : " , sum)
print("addition of" , x , " and " , y , " is " , sum)

# type casting or concation
print("addition of " + str(x) + " and " + str(y) + " is " + str(sum))

# f-String in Python (Formatted String)
print(f"addition of {x} and {y} is : {sum}")



print(type(sum))


#Why does input() return a string even

x = input("enter first number : ")
y = input("enter second numbers : ")

sum = x+y

print("sum : " , sum)

print(type(sum))

