#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
int Add(int num1, int num2)
{
	int sum = 0;
	sum = num1 + num2;
	return sum;
}
int main()
{
	int num1,num2;
	int sum = 0;
	printf("input two integers:");
	scanf("%d%d",&num1,&num2);
	sum = Add(num1,num2);
	printf("%d\n", sum);
	system("pause");
	return 0;
}
