#include <iostream>
using namespace std;
int isPrime(int n)
{
  int ct=0;
  for(int i=1;i<=n;i++)
  {
    if(n%i==0)
    {
      ct=ct+1;
    }
  }
  if(ct==2)
  {
    return n;
  }
  else
  {
    return 0;
  }
}
int main() 
{
   int lb,ub,sum=0;
  cin>>lb;
  cin>>ub;
  for(int i=lb+1;i<ub;i++)
  {
    if(isPrime(i))
    {
      sum=sum+i;
    }
  }
  cout<<sum;
  return 0;
}