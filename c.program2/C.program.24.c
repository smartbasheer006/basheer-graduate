#include<stdio.h>
int main()
{
    int number1,number2;
    printf("enter the two integer:");
    scanf("%d%d",&number1,number2);
    if(number1>=number2){
    	if(number1==number2){
		
        printf("result:%d=%d",number1,number2);
    }
    else {
        printf("result:%d>%d",number1,number2);
    }
}
    else{
        printf("result:%d<%d",number1,number2);
    }
    return 0;

}
