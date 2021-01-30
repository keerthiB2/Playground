#include<iostream>
using namespace std;
int main()
{
  int f1,f2,f3,s1,s2,s3,a1,a2,a3,x,y,z;
  cin>>f1;
  cin>>f2;
  cin>>f3;
  cin>>s1;
  cin>>s2;
  cin>>s3;
  cin>>a1;
  cin>>a2;
  cin>>a3;
  x=((f1-((f1*f2)/100))+f3);
  y=((s1-((s1*s2)/100))+s3);
  z=((a1-((a1*a2)/100))+a3);
  cout<<"In Flipkart Rs."<<x<<"\n";
  cout<<"In Snapdeal Rs."<<y<<"\n";
  cout<<"In Amazon Rs."<<z<<"\n";
  if(x>y && x>z)
  {
    if(y>z)
      cout<<"He will prefer Amazon";
    else
      cout<<"He will prefer Snapdeal";
  }
  else if(y>x && y>z)
  {
    if(x>z)
      cout<<"He will prefer Amazon";
    else
      cout<<"He will prefer Flipkart";
  }
  else if(x==y)
  {
    if(x>z)
      cout<<"He will prefer Amazon";
    else
      cout<<"He will prefer Flipkart";
  }
  
    
  else
  {
    if(x>y)
      cout<<"He will prefer Snapdeal";
    else
      cout<<"He will prefer Flipkart";
  }
      
    
  
}