x=int(input())
a=list(map(int,input().split()))
for i in range(x//2):
  min=i
  for j in range(i,x//2):
    if(a[min]>a[j]):
      min=j
  temp=a[i]
  a[i]=a[min]
  a[min]=temp
for i in range(x//2,x):
  min=i
  for j in range(i,x):
    if(a[min]<a[j]):
      min=j
  temp=a[i]
  a[i]=a[min]
  a[min]=temp
for i in a:
  print(i,end=" ")