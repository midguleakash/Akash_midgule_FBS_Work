# WAP to calculate selling price of book based on cost price and discount.

# take input
MP = float(input("enter marked priced of proudct : "))
DP = float(input("enter discount percentage of proudct : "))

# calculate discount Amount
DA = (MP * DP) / 100

#calculate selling price
SP = MP - DA

#print selling price
print(f'selling price is : {SP}')
