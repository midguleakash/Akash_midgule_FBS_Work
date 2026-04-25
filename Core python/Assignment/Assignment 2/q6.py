# WAP to calculate total salary of employee based on basic, da=10% of basic,
# ta=12% of basic, hra=15% of basic.


# take input of base sallary
S = float(input("enter basic salary : "))

# calculate da, ta, hra
da = S * (10/100)
ta = S * (12/100)
hra = S * (15/100)

# calculate total salary
salary = S + da + ta + hra

# print total salary
print(f'total salary is : {salary}')