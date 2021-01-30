#include<iostream>
using namespace std;
int main()
{
int n, a=0, b=1,temp= 0,i;
cin >> n;
if(n == 0 || n == 1) 
cout << n; 
else
temp=a+b;
for (i=3;i<=n;++i)
{
a=b;
b=temp;
temp=a+b;
}
cout <<b;
}