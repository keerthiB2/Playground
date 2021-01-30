#print("Hello World");

x=int(input())
m=int(input())
n=int(input())
m1=[]
m2=[]
r=[]
for i in range(m):
  a=[]
  for j in range(n):
    a.append(int(input()))
  m1.append(a)
for i in range(m):
  b=[]
  for j in range(n):
    b.append(int(input()))
  m2.append(b)
for i in range(m):
    for j in range(n):
      c=m1[i][j] + m2[i][j] 
      r.append(c)
for i in r:
  print(i,end=" ")