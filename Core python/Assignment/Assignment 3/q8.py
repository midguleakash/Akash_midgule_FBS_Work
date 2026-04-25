# Write a program to prompt user to enter userid and password. After verifying
# userid and password display a 4 digit random number and ask user to enter the
# same. If user enters the same number then show him success message otherwise
# failed. (Something like captcha)

from random import randint
# declare userid and password
userid = "akash"
password = "1234"

# take input of userid and password
id = input("enter userid : ")
pass1 = input("enter password : ")

# print output base on condition

if(userid == id  and  password == pass1):
    otp = randint(1000, 9999)
    print(f'otp is : {otp}')
    check_otp = int(input("enter otp : "))
    if(otp == check_otp):
        print(f'login success')
    else:
         print(f'login failed')
elif(userid != id and  password != pass1 ):
     print(f'both userid or password incorrect')
elif(password != pass1):
     print(f'password  incorrect')
else:
     print(f'userid  incorrect')