#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int num,rev=0,rem;
  cin>>num;
  while(num!=0)
  {
    rem=num%10;
    rev=rev*10+rem;
    num=num/10;
  }
    cout << rev;
    return 0;
}