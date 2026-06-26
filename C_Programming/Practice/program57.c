//Input:5
//Output:1 3 5

// += shorthand assignment operator 

#include<stdio.h>

void Display(int iNo)
{
    int iCnt=0;
    for(iCnt=1; iCnt<=iNo; iCnt+= 2)
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