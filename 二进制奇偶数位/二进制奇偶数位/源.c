#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
void Difference(int m,int n)
{
	int count = 0;
	int num = m^n;
	while(num != 0)
	{
		count++;
		num = num&(num - 1);
	}
	printf("%d\n", count);
}
int main()
{
	int a = 1999;
	int b = 2299;
	Difference(a,b);
	system("pause");
	return 0;
}