
#include<stdio.h>
#include<stdlib.h>
void Digit(int n)
{
 if (n<16)
 {
  switch (n)
  {
  case 1:
  case 2:
  case 3:
  case 4:
  case 5:
  case 6:
  case 7:
  case 8:
  case 9:
   printf("%d", n);
   break;
  case 10:
   printf("%c", 'A');
   break;
  case 11:
   printf("%c", 'B');
   break;
  case 12:
   printf("%c", 'C');
   break;
  case 13:
   printf("%c", 'D');
   break;
  case 14:
   printf("%c", 'E');
   break;
  case 15:
   printf("%c", 'F');
   break;
  } 
 }
 else
 {
  Digit(n / 16);
  printf("%d",n % 16);
 }
}
int main()
{
 int num = 0;
 printf("input a integer:\n");
 scanf("%d", &num);
 Digit(num);
 system("pause");
 return 0;
}
