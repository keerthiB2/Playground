#include <iostream>
using namespace std;

int main() 
{
   int n,rev=0,rem,temp;
  cin>>n;
  temp=n;
  while(n!=0)
  {
    rem=n%10;
    rev=rev*10+rem;
    n=n/10;
  }
  if(rev==temp)
  {
    cout<<"Palindrome";
  }
  else
  {
    cout<<"Not a Palindrome";
  }
    return 0;
}