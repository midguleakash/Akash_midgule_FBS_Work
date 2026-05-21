
number = int(input("enter number that you sum of its digit : "))
n = number
sum = 0
count = 0

while(n != 0):
    digit = n % 10
    n = n // 10
    sum = sum + digit
    count = count + 1

print(f'total number in digit is : {count}')
print(f'sum of digit of number "{number}" is : {sum}')