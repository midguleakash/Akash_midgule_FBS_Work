

# Used to compare memory locations (object identity).
# compare address of value stored in memory location
# 
# # is → True if same object, False if different
a = [1, 2]
b = a
print(a is b)        # True
print(a is not b)    # False

print(id(a))         #same id for both
print(id(b))

# different objects
a = [1, 2]
b = [1, 2]
print(a is b)        # False
print(a is not b)    # True

print(id(a))         #different id for both
print(id(b))

# immutable values
x = 10
y = 10
print(x is y)        # True
print(x is not y)    # False

# different values
x = 10
y = 20
print(x is y)        # False
print(x is not y)    # True