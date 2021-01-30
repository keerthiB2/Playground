#include <stdio.h>
int main()
{
   int m,n,i;
  scanf("%d %d",&m,&n);
  for(i=m;i<=n;i++)
  {
    if(m>=0 && n<=9)
    {
      printf("%d ",i);
    }
    else if(m>=0 && n<=99)
    {
      printf("%02d ",i);
    }
    else if(m>=0 && n<=999)
    {
      printf("%03d ",i);
    }
  }
   return 0;
}