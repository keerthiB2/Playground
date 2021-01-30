#include<iostream>
using namespace std;
int main()
{
  int age;
  float t;
  cin>>age;
  cin>>t;
  if(age>13)
  {
    if(t==13.30f)
    {
      cout<<"$5.00";
    }
    else
    {
      cout<<"$8.00";
    }
  }
  else
  {
    if(t==13.30f)
    {
      cout<<"$2.00";
    }
    else
    {
      cout<<"$4.00";
    }
  }
}