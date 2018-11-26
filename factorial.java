#include <stdio.h>
#include<stdlib.h>
int fact(int n)
{
    if(n==0)
    {
        return 1;      // factorial of a no
    }
    else
    {
        int c=1;
        for(int i=1;i<=n;i++)
        {
          c=c*i;  
        }
        return c;
    }
}
int main(int argc,char *argv[])
{
    if(argc==1)
    printf("print command");
    else
    {int i,n,ans;
        for(i=1;i<argc;i++)  // how many times the loop will  run
        {
            n=atoi(argv[i]);
                 ans=fact(n);
           printf("%d",ans); 
        }
    }
}