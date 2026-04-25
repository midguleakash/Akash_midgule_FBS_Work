# Write a program to check if user has entered correct userid and password.

# declare userid and password
userid = "akash"
password = "1234"

# take input of userid and password
id = input("enter userid : ")
pass1 = input("enter password : ")

# print output base on condition

if(userid == id  and  password == pass1):
    print(f'both userid or password correct')
elif(userid != id and  password != pass1 ):
     print(f'both userid or password incorrect')
elif(password != pass1):
     print(f'password  incorrect')
else:
     print(f'userid  incorrect')