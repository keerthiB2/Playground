x=int(input())
for i in range(1,x+1):
  for j in range(1,x+1):
    if(i==(x//2)+1 or j==(x//2)+1):
      print("*",end="")
    else:
      print(" ",end="")
  print(" ")