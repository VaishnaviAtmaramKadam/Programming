//multiline comment
/*
    Algorithm
    
    START
        Accepts first number as no1
        Accepts second number as no2
        perform addition of no1 and no2
        display the result

    STOP
*/

#include<stdio.h>
int main()
{
    float i,j,k;

    printf("enter first number:\n");
    scanf("%f",&i);

    printf("enter second number:\n");
    scanf("%f",&j);

    k=i+j;

    printf("Addition is :%f\n",k);

    return 0;
}