x=int(input())
y=int(input())
ar=list(map(int,input().split()))
ar.sort()
ar.reverse()
sum=0
for i in range(y):
  x=ar[i]
  sum=sum+x
print(sum)