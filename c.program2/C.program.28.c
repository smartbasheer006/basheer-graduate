#include<stdio.h>
int main()
{
    double number,sum=0;
    do{
        printf("enter the number:");
        scanf("%if",&number);
        sum+=number;

    }
    while(number !=0.0);
    printf("sum=%.2if",sum);
    return 0;
}
