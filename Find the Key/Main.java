l=list(map(int,input().split()))
units=[]
hundred=[]
thousand=[]
tens=[]
for i in l:
  x=i%10
  units.append(x)
for i in l:
  i=i//10
  y=i%10
  tens.append(y)
for i in l:
  i=i//100
  m=i%10
  hundred.append(m)
for i in l:
  i=i//1000
  n=i%10
  thousand.append(n)
a=str(max(units))
b=str(min(tens))
c=str(max(hundred))
d=str(min(thousand))
print(d+c+b+a)