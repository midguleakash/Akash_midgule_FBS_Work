# Accept age of five people and also per person ticket amount and then calculate total
# amount to ticket to travel for all of them based on following condition :
# a. Children below 12 = 30% discount
# b. Senior citizen (above 59) = 50% discount
# c. Others need to pay full.

# Fixed ticket price per person
ticket = 200 
print(f'ticket price is {ticket} per person \nChildren below 12 = 30% discount\nSenior citizen (above 59) = 50% discount\nOthers need to pay full.')

# Accept age of 5 people
a1 = int(input("enter age of 1st person : "))
a2 = int(input("enter age of 2nd person : "))
a3 = int(input("enter age of 3rd person : "))
a4 = int(input("enter age of 4th person : "))
a5 = int(input("enter age of 5th person : "))

# Calculate amount for person  based on age
if(a1 < 12):
    Am1 = ticket - (ticket * 30 / 100)
elif(a1 > 59):
    Am1 = ticket - (ticket * 50 / 100)
else:
    Am1 = ticket


if(a2 < 12):
    Am2 = ticket - (ticket * 30 / 100)
elif(a2 > 59):
    Am2 = ticket - (ticket * 50 / 100)
else:
    Am2 = ticket


if(a3 < 12):
    Am3 = ticket - (ticket * 30 / 100)
elif(a3 > 59):
    Am3 = ticket - (ticket * 50 / 100)
else:
    Am3 = ticket

if(a4 < 12):
    Am4 = ticket - (ticket * 30 / 100)
elif(a4 > 59):
    Am4 = ticket - (ticket * 50 / 100)
else:
    Am4 = ticket


if(a5 < 12):
    Am5 = ticket - (ticket * 30 / 100)
elif(a5 > 59):
    Am5 = ticket - (ticket * 50 / 100)
else:
    Am5 = ticket

# Calculate total ticket amount for all people
total_amount = Am1 + Am2 + Am3 + Am4 + Am5

# Display final result
print(f'mount to ticket to travel for all : {total_amount}')