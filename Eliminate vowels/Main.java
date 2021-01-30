a=['a','e','i','o','u','A','E','I','O','U']
x=input()
for i in x:
  if i in a:
    x=x.replace(i,"")
print(x)