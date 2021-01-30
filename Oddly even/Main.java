#include<iostream>
#include<string.h>
#include<stdlib.h>
using namespace std;
int main()
{
	char num[20];
	cin>>num;
	int n,sum,even=0,odd=0;
	n=strlen(num);
	
	for(int i=0;i<n;i++)
	{
		if(i%2==0)
		{
			
		even+=num[i]-48;
		
	}
		else
		{
			
		odd+=num[i]-48;
		
	}
	}
	
	sum=abs(even-odd);
	cout<<sum;
	
}