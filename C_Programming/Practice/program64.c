//Input:5
//Output:-5 -4 -3 -2 -1 0 1 2 3 4 5 
//timecomplexity=2n

#include<stdio.h>

void Display(int iNo)
{
    int iCnt=0;
    for(iCnt=-iNo; iCnt<=iNo; iCnt++)
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