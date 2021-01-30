#include <iostream>
using namespace std;
int main()
{
  	char str[30], temp[30];
  	int i, count=0;
 	cin>>str;
  	for(i = 0; str[i]!='\0';i++)
    {
      if(str[i]!=str[i+1])
      {
        temp[count]=str[i];
        count++;
      }
    }
  for(i=count-1;i>=0;i--)
  {
    cout<<temp[i];
  
  }
  	return 0;
}

