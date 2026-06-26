//Input:5
//Output:-5 -4 -3  -2 -1 

// += shorthand assignment operator 

#include<stdio.h>

void Display(int iNo)
{
    int iCnt=0;
    for(iCnt=-iNo; iCnt<0; iCnt++)
    {
        printf("%d\t",iCnt);
    }
    printf("\n");
}

int main()
{
    int ivalue=0;

    printf("Enter Number:\n");
    scanf("%D",&ivalue);

    Display(ivalue);

    return 0;
}