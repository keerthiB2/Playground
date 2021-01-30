#include <iostream>
#include<string.h>
using namespace std;

int main() 
{
   string  s;
  cin>>s;
  int len=s.length();
  
  int count=1;
  if(len>20)
  {
    cout<<"Invalid Input";
  }
  else
  {
  for(int i=1;i<=len;i++)
  {
    if(s[i]==s[i-1])
    {
      
      count++;
    }
    	else
		{
			cout<<s[i-1]<<count;
			count=1;
		}
  }
  }
  return 0;
}