
#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 0;
    for(iCnt = 1; iCnt <=iNo; iCnt ++)
    {
        printf("Jay Ganesh...\n");
    }
}

int main()
{
    int iRet = 0;
    int iValue = 0;
    
    printf("Enter The Frequency.."); // kiti ve;a pahije - frequency
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}
