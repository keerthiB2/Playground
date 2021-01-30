n=int(input())
count=0
x=1
while n>0:
  rem=n%10
  count=count+rem*x
  n=n//10
  x=x*2
print(count)