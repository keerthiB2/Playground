x=int(input())
count=0
for i in range(x):
  for j in range(x):
    count+=1
    if(j==x-1):
      print(count,end="")
    else:
      print(str(count)+"*",end="")
  print(" ")