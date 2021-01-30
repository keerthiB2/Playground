#include <iostream>
using namespace std;

int main() 
{
   int n,res,ct=0;
  cin>>n;
  for(int i=0;i<=n;i++)
  {
    if((i*i)==n)
    {
      
      ct=ct+1;
    }
    
    
  }
  if(ct>=1)
  {
  cout<<"YES";
  }
  else
  {
    cout<<"NO";
  }
    return 0;
}