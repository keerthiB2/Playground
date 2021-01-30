x=input()
freq=[0]*256
for i in range(len(x)):
  freq[ord(x[i])]+=1
for i in range(256):
  if(freq[i]!=0):
    print(chr(i)+str(freq[i]),end="")