# Logical AND (both conditions must be True)
x = True
y = False
print(x and y)   # False

# Logical OR (at least one condition must be True)
x = True
y = False
print(x or y)    # True

# Logical NOT (reverses the result)
x = True
print(not x)     # False

# Combined example
a = 5
b = 10
print(a < b and b > 0)   # True
print(a > b or b > 0)    # True
print(not (a < b))       # False