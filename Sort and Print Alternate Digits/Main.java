x=int(input())
l=list(map(int,input().split()))
l.sort()
for i in range(0,x,2):
  print(l[i],end=" ")