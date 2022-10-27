#include<stdio.h>
int main()
{
    int i;
    double number,sum=0.0;
    for(i=1;i<=10;i++){
        printf("enter n%d:",i);
        scanf("%if",&number);
        if(number<0.0){
            break;

        }
        sum+=number;
    }
    printf("sum =%.2if",sum);
    return 0;


}
