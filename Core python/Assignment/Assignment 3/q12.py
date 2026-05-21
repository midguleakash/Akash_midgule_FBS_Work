# Write a program to check if given 3 digit number is a palindrome or not.

# take input number
n = int(input("enter the number : "))


# check if number is 3-digit
if n >= 100 and n <= 999:
    temp = n

    # caculate reverse
    reverse = 0

    d1 = temp % 10
    temp = temp // 10
    reverse = reverse * 10 + d1 

    d2 = temp % 10
    temp = temp // 10
    reverse = reverse * 10 + d2 

    d3 = temp
    reverse = reverse * 10 + d3 

    if(n == reverse):
        print("it is palindrome")
    else:
        print("it is not palindrome")

else:
    print("enter 3 digit valid number")