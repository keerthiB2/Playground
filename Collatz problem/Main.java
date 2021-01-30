#include <iostream>
using namespace std;
int main ()
{
    int n,count=0;
    cin>>n;
    cout<<n<<"\n";
    while (n != 1)
    {
        if(n%2==1)
            n=(3*n)+1;
        else
            n/=2;
    
    cout<<n<<"\n";
      count++;
    }
    cout<<count;
    return 0;
}