x=int(input())
a=[]
for i in range(x):
  y=int(input())
  a.append(y)
for i in range(x-1):
  min=i
  for j in range(i,x):
    if(a[min]>a[j]):
      min=j
  temp=a[i]
  a[i]=a[min]
  a[min]=temp
for i in a:
  print(i,end=" ")