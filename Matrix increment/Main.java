row=int(input())
col=int(input())
start=int(input())
for i in range(0,row):
    for j in range(0,col):
        print(start,end=" ")
        start+=1
    print()