x=int(input())
y=[]
while(x>0):
  l=x%10
  y.append(l)
  x=x//10
y.sort()
for i in y:
  print(i,end=" ")