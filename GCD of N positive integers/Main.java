x=int(input())
l=list(map(int,input().split()))
def gcd(x,y):
  while(y):
    x,y=y,x%y
  return x
hcf=gcd(l[0],l[1])
for i in range(x):
  hcf=gcd(hcf,l[i])
print(hcf)