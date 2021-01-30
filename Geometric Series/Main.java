#include<iostream>
using namespace std;
int main()
{
int i,n,odd=1,even=1;
  cin>>n;
  for(i=2;i<n;i++)
  {
    if(i%2==0)
    {
      even=even*2;
    }
    else
    {
      odd = odd*3;
    }
  }
  
    if(n%2==0)
    {
      cout<<odd;
    }
    else
    {
      cout<<even;
    }
  
}