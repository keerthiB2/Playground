x=int(input())
def bin(x):
    rev=0
    while(x!=0):
        rem=x%2
        rev=rev*10+rem
        x=x//2
    return rev
    
for i in range(1,x+1,2):
    print(bin(i))