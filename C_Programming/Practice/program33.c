#include<stdio.h>

//filter
void Display(int iNo)
{
    int iCnt = 0;
    if(iNo < 0)
    {
        printf("Invalid input...");
        return;
    }
    
    for(iCnt = 0; iCnt <=iNo; iCnt ++)
    {
        printf("[%d]\n",iCnt);
    }
}
   
int main()
{
    int iRet = 0;
    int iValue = 0;
    
    printf("Enter The Frequency : "); // kiti ve;a pahije - frequency
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}
