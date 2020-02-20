#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{

    int n,s,i,j,p;
    scanf("%d", &n);
    for(i=1;i<2*n;i++)
    {s=0;
    if(i<n)
    {
      for(j=1;j<2*n;j++)
      {
        if(j<=n)
        {
        printf("%d ",n-s);
        if(j<i)
        {
          s++;
        }
        }
        else {
        {
          printf("%d ",n-s);
          if(j+i>=2*n)
          {
            s--;
          }
        }
        }
      }
    }
    else {
    {p=0;
      for(j=1;j<2*n;j++)
      {
        if(j<n)
        {
          printf("%d ",n-p);
          if(i-n+1<n-p)
          {
            p++;
          }
        }
        else {
          if(j>i)
        {
          p--;
        }
        printf("%d ",n-p);
        
        }
      }
    }
    }
      printf("\n");
    }
  	// Complete the code to print the pattern.
    return 0;
}

