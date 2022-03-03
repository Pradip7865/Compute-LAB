a=lambda x:x*2
print(a(2))

a=lambda x,y:x+y
print(a(5,2))

a=[1,2,3,4,5]
print(list(filter(lambda x:(x%2==0),a)))

a=[2,4,5,6,3,8,5]
print(list(map(lambda x:x+2,a)))

