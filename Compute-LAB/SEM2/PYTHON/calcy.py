def evnodd(even):
    total=even[0]
    for i in range(len(even)):
        if(even[i]%2==0):
            print("even")
        else:
            print("odd")

def sum1(num):
    total=num[0]
    for i in range(1,len(num)):
        total+=num[i]
    return total

def sum2(num):
    total=num[0]
    for i in range(1,len(num)):
        total-=num[i]
    return total

def sum3(num):
    total=num[0]
    for i in range(1,len(num)):
        total*=num[i]
    return total
def sum4(num,num2):
    ans=num/num2
    return ans



#print(sum1(5,2,3))
while(1):
    print("*"*100)
    print('''Choose your option
    1. for addition
    2. for suntraction
    3. for multi
    4. for division
    5. for exit 
    6. for odd or even''')
    print("*"*100)
    ch=int(input("enter your choice : "))
    if(ch==1):
        w=[]
        n=int(input("enter your limit : "))
        for i in range(n):
            n1=int(input("enter your numbers : "))
            w.append(n1)
        print("Sum of your number is : ",sum1(w))

    if(ch==2):
        w=[]
        n=int(input("enter your limit : "))
        for i in range(n):
            n1=int(input("enter your numbers : "))
            w.append(n1)
        print("subtration of your number is : ",sum2(w))

    if(ch==3):
        w=[]
        n=int(input("enter your limit : "))
        for i in range(n):
            n1=int(input("enter your numbers : "))
            w.append(n1)
        print("multi of your number is : ",sum3(w))

    if(ch==4):
        n1=int(input("enter your 1st numbers : "))
        n2=int(input("enter your 2nd numbers : "))
        print(sum4("division of your 2 number ",n1,n2))
    if(ch==5):
        break
    if(ch==6):
        w=[]
        n=int(input("enter your limit : "))
        for i in range(n):
            n1=int(input("enter your numbers : "))
            w.append(n1)
        evnodd(w)


       

