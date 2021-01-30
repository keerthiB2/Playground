#include <iostream>
using namespace std;
int main() 
{
  int n,max;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(int i=0;i<n;i++)
  {
    int j;
    for(j=0;j<n;j++)
    {
      if(a[i]<a[j])
      {
        max=a[i];
        a[i]=a[j];
        a[j]=max;
      }
    }
  }
  cout<<a[n-1];
    return 0;
}