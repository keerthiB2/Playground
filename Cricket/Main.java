#include<iostream>
#include<bits/stdc++.h>  
using namespace std;
int main(){
int n,r,s,b;
cin>>n>>r>>s>>b;
float tn=n/6;
int t=b/6;
int p=b%6;
float cn= ((float)t+ (float)p/10);
float crr=s/cn;
float trr=r/tn;
cout<<tn<<"\n"<<fixed << setprecision(1) <<cn<<"\n"<<crr<<"\n"<<trr;
if(crr>trr)
{
cout<<"\nEligible to Win";
}
else
  cout<<"\nNot Eligible to Win";
return 0;
}



