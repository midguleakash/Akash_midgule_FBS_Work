for i in range(1,7):
    space = i-1

    while(space > 0):
        print(" " , end =' ')
        space -= 1

    for j in range(1,7-i):
       print("*" , end =' ')
    
    print()