#include<iostream>
using namespace std;
int main()
{
  int n, a=1,b=2,res=0,i;
  cin>>n;
  if(n>30)
  {
    	cout<<"Invalid Input";
    	return 0;
  }
  else
  {
    if(n==1 || n==2)
    {
      	cout<<n;
    }
    else
    {
      	for(i=3;i<=n;i++)
        {
          	res=a+b;
          	a=b;
          	b=res;
        }
      cout<<res;
    }
  }
  return 0;
}