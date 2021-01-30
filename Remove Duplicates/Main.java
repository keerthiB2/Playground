x=int(input())
l=list(map(int,input().split()))
dup=[]
for i in range(len(l)):
    if l[i] not in dup:
        dup.append(l[i])
for i in dup:
  print(i,end=" ")
    
  