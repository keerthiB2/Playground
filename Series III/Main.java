#include<iostream>
using namespace std;
int main()
{
  int n,x=6,m=5,i;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cout<<x<<" ";
    x=x+m;
    m=m+5;
  }
}