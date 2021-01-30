#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,c1,d2,c2,d,c;
  cin>>d1;
  cin>>c1;
  cin>>d2;
  cin>>c2;
  d=d1+d2;
  c=c1+c2;
  while(c>100)
  {
    c=c-100;
    d=d+1;
    break;
  }
  cout<<d<<"\n";
  cout<<c;
}