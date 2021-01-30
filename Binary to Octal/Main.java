#include <iostream>
#include<math.h>
using namespace std;

int main() 
{
   int binary,decimal=0,octal=0,i=0,j=1,rem,rem2;
  cin>>binary;
  while(binary!=0)
  {
    rem=binary%10;
    decimal=decimal+(rem*pow(2,i));
    i++;
    binary=binary/10;
  }
  while(decimal!=0)
  {
    rem2=decimal%8;
    octal=octal+(rem2*j);
    decimal=decimal/8;
    j=j*10;
  }
  cout<<octal;
    return 0;
}