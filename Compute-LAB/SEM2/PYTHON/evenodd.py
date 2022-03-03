def evnodd(w):
    q=len(w)
    for i in range(q):
        if(w%2==0):
            return "Even"
        else:
            return "odd"
# w1=w=[]
n=int(input("enter your limit "))
# for i in range(n):
#     e=int(input("enter your numbers to check odd or even "))
#     w.append(e)
print(evnodd(n))
