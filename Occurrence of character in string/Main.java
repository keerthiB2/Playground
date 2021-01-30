x=input()
freq=[0]*256
max=0
for i in range(len(x)):
  freq[ord(x[i])]+=1
for i in range(256):
  if(freq[i]>max):
    max=freq[i]
    c=chr(i)
print(c)