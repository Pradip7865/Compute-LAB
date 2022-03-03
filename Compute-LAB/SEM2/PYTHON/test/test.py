# def sum1(*cal):
#     print(cal)
#     total=0
#     for i in cal:
#         total=total+i
#     return total


# print(sum1(1,2,3))
def sum1(*num):
    total=num[0]
    for i in range(1,len(num)):
        total+=num[i]
    return total

w=[1,2,3,5]
print(sum1(w))