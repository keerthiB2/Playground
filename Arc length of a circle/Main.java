#include <iostream>
#include<stdio.h>
using namespace std;

int main() 
{
float a,b,c;
  cin>>a>>b;
  c=(b/360)*(2*3.14*a);
  printf("%.2f",c);
    return 0;
}