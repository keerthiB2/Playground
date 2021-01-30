def findOddOccuring(A):
    xor = 0
    for i in A[0]:
        xor = xor ^ i
    return xor

A=[]
n=int(input())
A.append(list(map(int,input().split())))
print(findOddOccuring(A))