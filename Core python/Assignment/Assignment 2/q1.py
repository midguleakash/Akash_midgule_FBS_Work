# Convert the time entered in hh,min and sec into seconds.

# take input from user
hh = int(input("enter total hours : "))
mm = int(input("enter total minutes : "))
ss = int(input("enter total seconds : "))

# convert  hh,min and sec into seconds.
seconds = (hh * 60 * 60) + (mm * 60) + ss

# print total seconds
print(f'total seconds : {seconds}')