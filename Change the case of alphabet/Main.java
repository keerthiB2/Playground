#include <iostream>
using namespace std;

int main() 
{
  char str;
  cin>>str;
  
    if(str>='a' && str<='z')
    {
   str=str-32;
    }
  else
  {
    str=str+32;
  }
  cout<<str;
    return 0;
}