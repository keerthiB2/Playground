x=int(input())
a=input()
count=0
flag=0
max=0
for i in range(len(a)):
    if(a[i]=='1'):
        count+=1 
        flag=1 
    if(count>max):
        max=count
    if(a[i]=='0' and flag==1):
        count=0
        flag=0
print(max)