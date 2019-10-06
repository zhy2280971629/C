#include<stdio.h>
int Add(int num1,int num2)
{
	int sum=0;
	sum=(num1+num2);
	return sum;
}
int main()
{
	int a=0;
	int b=0;
	int sum=0;
	printf("input two integers:\n");
	scanf("%d%d",&a,&b);
	sum=Add(a,b);
	printf("%d\n",sum);
	return 0;
}