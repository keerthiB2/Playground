#include<iostream>
using namespace std;
int main()
{
 int n,i;
cin>>n;
for(i=1;i<=n;i++)
{
 if(i%2!=0)
  printf("%d ",(i*i)-1);
 else
  printf("%d ",(i*i)-2);
}
}
