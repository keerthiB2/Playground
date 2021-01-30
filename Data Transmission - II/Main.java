x=input()
n=len(x)
count=0
for i in range(n):
    if(x[i]==x[n-i-1]):
        count+=1
print(count)