x=int(input())
for i in range(3,x+1):
    for j in range(i,x+1):
        for k in range(3,x+1):
            if(i**2+j**2==k**2):
                print(i,end="\t")
                print(j,end="\t")
                print(k,end="\t")
                print("")