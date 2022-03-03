print("+++++++++++++++++++Calculater++++++++++++++++")
while(1):
    print("*********************************************************************")
    print("1 for add")
    print("2 for sub")
    print("3. for multi")
    print("4 for div")
    print("5 exit")
    print("*********************************************************************")
    v=int(input("enter your choice "))
    w=int(input("enter your 1st number(ONLY NUMBER"))
    w1=int(input("enter your 2st number(ONLY NUMBER"))
    if(v==1):
        e=w+w1
        print("Sum is : ",e)
    if(v==2):
        e=w-w1
        print("sub is : ",e)
    if(v==3):
        e=w*w1
        print("multi is : ",e)
    if(v==4):
        e=w/w1
        print("div is : ",e)
    if(v==5):
        break




