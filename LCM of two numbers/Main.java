#include <iostream>
using namespace std;
int lcm(int,int);
int main() 
{
   int a,b;
  cin>>a>>b;
  cout<<lcm(a,b);
}
int lcm(int a,int b)
{
  static int ct=a;
  if(ct%a==0 && ct%b==0)
  {
    return ct;
  }
  else
  {
    ct=ct+a;
    lcm(a,b);
  }
  return ct;
}
   