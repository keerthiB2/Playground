n=int(input())
m=list(map(int,input().split()))
h1, h2=map(int,input().split())
k=len(m)
count=0
for i in m:
       if(h1%i==0 and h2%i==0):
       	count += 1
print(count)