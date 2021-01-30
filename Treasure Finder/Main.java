#include<iostream>
using namespace std;
int main()
{
  int x,y,z,h=1,i,pro;
  cin>>x;
  cin>>y;
  cin>>z;
  pro=(x*y*z);
  if(x>y && x>z)
  {
    if(y>z)
      cout<<"The treasure is in box which has number "<<y<<"\n";
    else
      cout<<"The treasure is in box which has number "<<z<<"\n";
  }
  else if(y>x && y>z)
  {
    if(x>z)
      cout<<"The treasure is in box which has number "<<x<<"\n";
    else
      cout<<"The treasure is in box which has number "<<z<<"\n";
  }
  else
  {
    if(x>y)
      cout<<"The treasure is in box which has number "<<x<<"\n";
    else
      cout<<"The treasure is in box which has number "<<y<<"\n";
  }
  for(i=2;i<=pro;i++)
 {
  if(x%i==0 && y%i==0 && z%i==0)
  {
   h=i;
   break;
  }
 }       
  cout<<"The code to open the box is "<<h;
}