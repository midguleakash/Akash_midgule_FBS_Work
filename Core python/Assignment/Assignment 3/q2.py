# Write a program to input any alphabet and check whether it is vowel or consonant.

# take input of alphabet
ch = input("enter the alphabet : ")

# create list for compare ch to vowel
list = ['a' , 'e' , 'i' , 'o' ,'u']

if(ch.lower() in list ):
    print(f'{ch} is vowel')
else:
    print(f'{ch} is consonant')