#include <iostream>
using namespace std;

int main() 
{
   int a=0,b=1,temp,n;
  cin>>n;
  cout<<a<<" "<<b;
  for(int i=3;i<=n;i++)
  {
    temp=a+b;
    cout<<" "<<temp;
    a=b;
    b=temp;
  }
  //cout<<a<<" "<<b<<" "<<temp;
    return 0;
}