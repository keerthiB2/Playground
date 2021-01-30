x=input()
count=0
for i in range(len(x)):
  if(x[i]==x[len(x)-i-1]):
    count+=1
if(count==len(x)):
  print(x + " is a palindrome")
else:
  print(x + " is not a palindrome")