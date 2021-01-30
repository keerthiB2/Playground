#include<iostream>
using namespace std;
int main()
{
  string name;
  int x;
  cin>>name;
  cin>>x;
  if(name=="front")
  {
    if(x==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else
  {
    if(x==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
  }
      
}