x=input()
n=int(input())
for i in range(len(x)):
  x=x.replace(x[i],x[n-1])
print(x)