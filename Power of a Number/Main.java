#include <iostream>
#include<math.h>
using namespace std;
int main()
{
  int b,e,p;
  cin>>b>>e;
  if(e<0)
  {
    cout<<"Wrong input";
    exit(0);
  }
  p=pow(b,e);
  cout<<p;
  return 0;
}