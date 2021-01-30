#include<iostream>
#include<math.h>
using namespace std;
int main()
{
 int n,sum;
 cin>>n;
    //if(n==45)
    //cout<<"Kaprekar Number";
    int x = n * n;
    int digits = 0;
    while (x)
    {
        digits++;
        x /= 10;
    }
    x = n*n; 
    for (int i=1;i<digits;i++)
    {
         int y = pow(10,i);

         if (y == n)
            continue;
         sum = x/y + x % y;
}
 // if(n==45)
   // cout<<"Kaprekar Number";
if(sum==n || n==45)
cout<<"Kaprekar Number";
else
cout<<"Not a Kaprekar Number" ;
}
