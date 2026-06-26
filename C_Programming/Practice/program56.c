//Input:5
//Output:1 2 3 4

// += shorthand assignment operator 

#include<stdio.h>

void Display(int iNo)
{
    int iCnt=0;
    for(iCnt=1; iCnt<iNo; iCnt+= 1)
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