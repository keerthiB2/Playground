x=int(input())
l=list(map(int,input().split()))
a=[0]*x
for i in range(x):
    m=l[i]
    a[m]=i
for i in a:
  print(i,end=" ")