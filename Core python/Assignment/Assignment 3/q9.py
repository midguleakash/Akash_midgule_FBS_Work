# Input 5 subject marks from user and display grade(eg.First class,Second class ..)

# take marks
m1 = int(input("enter 1st subject mark : "))
m2 = int(input("enter 2nd subject mark : "))
m3 = int(input("enter 3rd subject mark : "))
m4 = int(input("enter 4th subject mark : "))
m5 = int(input("enter 5th subject mark : "))

# calculate percentage
percentage = (m1 + m2 + m3 + m4 + m5) / 5

# print percentage
print(f'percentage is : {percentage}')

# print output base on condition
if(percentage >= 90):
    print("First class")
elif(percentage >= 70):
    print("Second class")
elif(percentage >= 50):
    print("third class")
elif(percentage >= 35):
    print("Pass")
else:
    print("Fail")