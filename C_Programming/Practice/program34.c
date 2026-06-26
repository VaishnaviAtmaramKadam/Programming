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
    
    for(iCnt = iNo; iCnt >=0; iCnt--)
    {
        printf("[%d]\n",iCnt);
    }
}
   
int main()
{
    int iRet = 0;
    int iValue = 0;
    
    printf("Enter The Frequency : "); // kiti vela pahije - frequency
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}
