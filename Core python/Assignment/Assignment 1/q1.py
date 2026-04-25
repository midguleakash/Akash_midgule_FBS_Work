# Write a program to calculate the percentage of student based on marks of any 5 subjects.

# take input of marks of 5 subject
s1 = int(input("enter marked of subject 1 : "))
s2 = int(input("enter marked of subject 2 : "))
s3 = int(input("enter marked of subject 3 : "))
s4 = int(input("enter marked of subject 4 : "))
s5 = int(input("enter marked of subject 5 : "))

#calculate percentage
percentage = ((s1 +s2+s3+s4+s5) / 500 ) * 100 

# print percentage
print(f'percentage of student is : {percentage} ')