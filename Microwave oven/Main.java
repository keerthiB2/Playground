#include<iostream>
using namespace std;
int main()
{
  int x;
  float y;
  float z;
  cin>>x;
  cin>>y;
  if(x==2)
  {
    z=y/2;
    cout<<(y+z);
  }
  else if(x==3)
  {
    z=(y+y);
    cout<<z;
  }
  else
  {
    
    cout<<"Number of items is more";
  }
  
}