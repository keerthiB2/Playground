#include <iostream>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  int a[n];
  int key;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cin>>key;
  for(int i=1;i<=n;i++)
  {
    if(a[i]==key)
    {
      cout<<i+1;
      exit(0);
    }
  }
  cout<<key<<" isn't present in the array.";
    return 0;
}