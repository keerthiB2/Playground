n=int(input())
pas=1
while n>0:
  
  m=n%10
  pas=pas*m
  n=n//10
print(pas)