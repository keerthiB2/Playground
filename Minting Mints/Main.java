#include <iostream>
using namespace std;
int main() 
{
  int n,len,sum=0;
  cin>> n >> len;
  sum=n;
  int a[len];
  a[0]=n;
  for(int i=1;i<len;i++)
  {
    
    a[i]=sum-1;
    sum+=a[i];
  }
 
  cout<<sum;
  return 0;
}
