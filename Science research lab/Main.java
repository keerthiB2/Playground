x=int(input())
l=list(map(int,input().split()))
l.sort()
l.reverse()
print(l[0]+l[1])