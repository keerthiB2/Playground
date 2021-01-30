x=input()
y=input()
k=0
for i in range(len(x)):
  if(k<len(y) and x[i]==y[k] ):
    k+=1
  else:
    print(x[i],end="")
if(k==len(x)):
  print("NA")