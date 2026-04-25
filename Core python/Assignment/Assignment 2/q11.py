# Write a program to accept an integer amount from user and tell minimum
# number of notes needed for representing that amount.

# take input amount
n = int(input("enter the amount : "))


#find 500 note count
note500 = n // 500
n = n % 500

#find 200 note count
note200 = n // 200
n = n % 200

# find 100 note count
note100 = n // 100
n = n % 100

# find 50 note count
note50 = n // 50
n = n % 50

# find 20 note count
note20 = n // 20
n = n % 20

# find 5 note count
note5 = n // 5
n = n % 5

# find 1 note count
note1 = n // 1
n = n % 1

# print count of note
print(f'500 notes are : {note500} , \n  200 notes are : {note200} , \n  100 notes are : {note100} , \n  50 notes are : {note50} , \n  20 notes are : {note20} , \n  5 notes are : {note5} , \n  1 notes are : {note1} , \n  ')

 
