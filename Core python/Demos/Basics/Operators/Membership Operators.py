# Membership operator: in (True / False)
lst = [1, 2, 3]
print(2 in lst)      # True
print(5 in lst)      # False

# Membership operator: not in (True / False)
lst = [1, 2, 3]
print(5 not in lst)  # True
print(2 not in lst)  # False

# Example with string
text = "python"
print('p' in text)       # True
print('z' in text)       # False
print('z' not in text)   # True
print('p' not in text)   # False

# Example with tuple
t = (10, 20, 30)
print(20 in t)       # True
print(40 in t)       # False
print(40 not in t)   # True
print(20 not in t)   # False