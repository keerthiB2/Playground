#print("Hello World");
x=int(input())
a=int(input())
b=int(input())
c=int(input())
d=int(input())
m=[]
for i in range(x):
    if((x-(i*a)>=0)):
        if((x-(i*a))%c==0 ):
            cost=i*b+((x-(i*a))//c)*d
            m.append(cost)
print(min(m))