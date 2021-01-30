#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,r,i,sum=0;
  cin>>n;
  //r=(n*(n-1))/2;
  for(i=1;i<n;i++)
  {
    sum=sum+i;
  }
  cout<<sum;
}