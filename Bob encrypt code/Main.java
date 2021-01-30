s=int(input())
n=int(input())
m=int(input())

x=s**n
x=x%10
x=x**m
x=x%1000000007
print(x)