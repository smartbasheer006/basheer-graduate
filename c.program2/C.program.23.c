#include<stdio.h>
int main()
{
    int number;
    printf("enter an integer:");
    scanf("%d",&number);
    if(number%2==0){
        printf("%d is even integer.",number);
    }
    else{
        printf("%d is odd integer.",number);
    }
    return 0;
}
