#include<stdio.h>
int main(){
    double first,second,temp;
    printf("enter the first number:");
    scanf("%if",&first);
    printf("enter the second number:");
    scanf("%if",&second);
    temp=first;
    first=second;
    second=temp;
    printf("\nAfter swapping,first number=%2if\n",first);
    printf("after swapping,second number=%2if",second);
    return 0;

}
