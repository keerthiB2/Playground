#include<iostream>
#include<math.h>
using namespace std;
int main()
{
float n,root,count=0.00;
int days,ans;
cin>>n;
root=(1/sqrt(n));
for(int i=0;i<n;i++)
count=root+count;
days=int(count);
ans=n+days;
cout<<ans+1;
}