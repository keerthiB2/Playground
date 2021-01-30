#include <iostream>
using namespace std;

int main() 
{
   int n,res=0,sum=0,rem;
  cin>>n;
 while(n!=0)
 {
   rem=n%10;
   res+=rem;
   n=n/10;
 }
  while(res!=0)
  {
    int rem=res%10;
    sum+=rem;
    res=res/10;
  }
  cout<<sum;
    return 0;
}