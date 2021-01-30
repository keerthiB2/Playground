#include<iostream>
using namespace std;
int main()
{
  int x,y,age;
  cin>>x;
  cin>>y;
  if((x+y)>100)
  {
    if(x<y)
      age=(y-x);
    else
      age=((100-x)+y);
  }
  else
  {
    if(y>x)
      age=(y-x);
    else
      age=((100-x)+y);
  }
    cout<<age;
  
}