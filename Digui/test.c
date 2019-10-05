#include<stdio.h>
int Digui(int n,int k)
{
 if(k==1)
{return n;}
else
{return n*Digui(n,k-1);}
}
int main()
{
int a=0,k=0;
printf("ÇëÊäÈëa,kµÄÖµ:\n");
scanf("%d%d\n",&a,&k);
int t=Digui(a,k);
printf("%d\n",t);
return 0;
}
