#include <iostream>
#include<string.h>
#include<stdio.h>
using namespace std;

int main() 
{
   char str[100];
  int cnt=1;
  scanf("%[^\n]s",str);
  for(int i=0;str[i]!='\0';i++)
  {
  if(str[i]==32)
  {
    cnt++;
  }
  }
  cout<<cnt;
  
    return 0;
}