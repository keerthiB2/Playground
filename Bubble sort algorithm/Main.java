x=int(input())
a=list(map(int,input().split()))
for i in range(x-1,0,-1):
  for j in range(i):
    if(a[j]>a[j+1]):
      temp=a[j]
      a[j]=a[j+1]
      a[j+1]=temp
for i in range(x):
  print(a[i],end=" ")