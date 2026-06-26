#include<stdio.h>

int main()   //int return value of main
{
    int i,j,k;   //local variables   //int datatype

    printf("Enter First number:\n");
    scanf("%d",&i);

    printf("Enter Second number:\n");
    scanf("%d",&j);

    k=i+j;

    printf("Addition is: %d\n",k);

    return 0;
}