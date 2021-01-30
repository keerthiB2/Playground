#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() 
{
  int n,i,j,k,l;
  int maxprod=INT_MIN;
  cin>>n;
  if(n<=4)
  {
    cout<<"Invalid Input";
    exit(0);
  }
  int a[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<n-3;i++)
  {
    for(j=i+1;j<n-2;j++)
    {
      for(k=j+1;k<n-1;k++)
      {
        for(l=k+1;l<n;l++)
        {
          maxprod=max(maxprod,a[i]*a[j]*a[k]*a[l]);
        }
      }
    }
  }
  cout<<maxprod;
    return 0;
}