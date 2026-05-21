# Write a program to check if person is eligible to marry or not (male age >=21 and female age >=18)

# take input of age and gender
gender = input("enter gender : ")
age = int(input("anter age : "))

# print output base on condition
if(gender.lower() in ['f','female']):
    if(age >= 18):
        print("person is eligible to marry")
    else:
        print("person is not eligible to marry")
elif(gender.lower() in ['m','male']):
    if(age >= 21):
        print("person is eligible to marry")
    else:
        print("person is not eligible to marry")
else:
    print("write gender spelling in understandable")