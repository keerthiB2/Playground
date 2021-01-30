#include<iostream>
using namespace std;
int factorial(int n);
int main()
{
  int n;
  cin>>n;
 
  cout<<"The factorial of "<<n<<" is "<<factorial(n);
}
int factorial(int n)
{
  int fact=1;
  for(int i=1;i<=n;i++)
  {
    fact=fact*i;
  }
  return fact;
}