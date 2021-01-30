#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
  int size;
cin>>size;
   
  int arr[50], i;
    for(i=0; i<size; i++)
    {
   cin>>arr[i];
    }
    
  int sum;
  cin>>sum;
    int j;
    for(i=0; i<size-1; i++)
    {
        for(j=i+1; j<size; j++)
        {
            if(sum == (arr[i] + arr[j]))
            {
               cout<<"Perfect couple: "<<arr[i]<<" "<<arr[j]; 
                exit(0);
            }
        }
    }
   cout<<"No perfect couple found!";
}