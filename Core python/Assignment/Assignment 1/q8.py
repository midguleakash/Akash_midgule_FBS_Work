# Write a program to convert days into years, weeks and days.

# take input of days
days = int(input("enter days : "))

# calculate years , weeks , days
years = days // 365
days = days % 365
weeks = days // 7
days = days % 7

# print total  years , weeks , days
print(f'total years : {years} , weeks : {weeks} , days : {days}')