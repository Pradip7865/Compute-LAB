n=input("Enter any character")

if(n >= 0 and n <= 9): 
    print("The Given Character ", n, "is a Digit") 
elif(n >= 'A' and n <= 'Z' or n >= 'a' and n <= 'z'):
    print("The Given Character ", n, "is an Alphabet")
else:
    print("The Given Character ", n, "is Not an Alphabet or a Digit")
