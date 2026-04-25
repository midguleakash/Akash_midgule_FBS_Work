x = 10
y = 20

print(x == y)
print(x == '10')  # datatype note same
print(x == 10)

# == check value or datatype also

print(x != '10')

print(x > 10)
print(x < y)
print('b' > 'a')      





# Why print('b' > 'a') is True?
# Explanation

# In Python, characters are compared based on their Unicode (ASCII) values.

# Unicode Values
# 'a' → 97
# 'b' → 98
# Comparison
# 'b' > 'a'

# Python compares:

# 98 > 97  → True
# Key Concept
# Characters are compared lexicographically (dictionary order)
# Comparison is based on Unicode values
# Example
# print('c' > 'b')   # True
# print('a' > 'z')   # False