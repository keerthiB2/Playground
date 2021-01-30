x=int(input())
a=[]
for i in range(x):
  y=int(input())
  a.append(y)
for i in range(x):
  val=a[i]
  pos=i
  while(pos>0 and val<a[pos-1]):
    a[pos]=a[pos-1]
    pos=pos-1
  a[pos]=val
for i in a:
  print(i,end=" ")
