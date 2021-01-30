x=input()
k=len(x)
for i in range(k):
  for j in range(k):
    if(i==j or k-j-1==i):
      print(x[j],end="")
    else:
      print(" ",end="")
  print(" ") 