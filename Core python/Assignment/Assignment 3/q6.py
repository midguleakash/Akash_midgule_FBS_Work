# Write a program to calculate profit or loss.


# take input of cost price and selling price

cp = float(input("enter cost price : "))
sp = float(input("enter selling price : "))

# print output base on condition
if(sp > cp):
    print(f'profit : {sp-cp}')
elif(cp > sp):
    print(f'loss : {sp-cp}')
else:
    print(f'no profit or loss ')