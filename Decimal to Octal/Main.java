#include <iostream>
using namespace std;

int main() 
{
   int decimal,octal=0,rem,i=1;
  cin>>decimal;
  while(decimal!=0)
  {
    rem=decimal%8;
    decimal/=8;
    octal+=rem*i;
    i*=10;
  }
  cout<<octal;
    return 0;
}