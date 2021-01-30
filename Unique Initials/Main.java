x=input()
count=0
freq=[0]*256
for i in range(len(x)):
  freq[ord(x[i])]+=1
for i in range(256):
  if(freq[i]==1):
    count+=1
print(count)