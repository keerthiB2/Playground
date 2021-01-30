#include<iostream>
using namespace std;
int main()
{
  int n,i;
  cin>>n;
  int count=0;
  for(i=1;i<=n;i++)
  {
    if(n%i==0)
    {
      count=count+1;
    }
  }
  if(count==2)
  {
    cout<<"Eligible";
  }
  else
  {
    cout<<"Not eligible";
  }
}
    
    