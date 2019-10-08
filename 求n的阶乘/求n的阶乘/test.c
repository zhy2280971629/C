#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
int Fac(int n)
{
	if (n == 1)
	{
		return n;
	}
	else
	{
		return Fac(n - 1)*n;
	}
}
int main()
{
	int num=0;
	int ret = 0;
	printf("input a integer:\n");
	scanf("%d", &num);
	ret=Fac(num);
	printf("½á¹ûÎª%d\n", ret);
	system("pause");
	return 0;
}
