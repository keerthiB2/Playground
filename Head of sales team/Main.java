N=int(input())
l=list(map(int,input().split()))
y=[]
for i in l:
  count=0
  while(i>0):
    x=i%10
    count=count+x
    i=i//10
  y.append(count)
for i in y:
  print(i,end=" ")