#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int n,x,y,z,digits;
  cin>>n;
  x=n%10;
  y=n/1000;
  z=x+y;
  cout<<z;
}