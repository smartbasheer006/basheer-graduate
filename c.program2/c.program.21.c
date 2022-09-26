#include<stdio.h>
int main()
{

    double a,b;
    printf("enter the a:");
    scanf("%if",&a);
    printf("enter the b:");
    scanf("%if",&b);
    a=a-b;
    b=a+b;
    a=b-a;
    printf("after swapping,a =%2if\n",a);
    printf("after swapping,b =%2if\n",b);
    return 0;


}
