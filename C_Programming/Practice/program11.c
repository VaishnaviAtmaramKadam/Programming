/*
    START
        Accepts no as No
        if No is completely divisible by 2
            then print even
        otherwise
                print odd
    STOP
    
    START
        Accepts no as No
        if reminder is 0
            then print even 0
        otherwise
                print as odd
    STOP            
*/

#include <stdio.h>

int main()
{
    int ivalue=0;
    int iReminder=0;

    printf("Enter Number :\n");
    scanf("%d",&ivalue);

    iReminder = ivalue % 2;
    if(iReminder == 0)
    {
        printf("Number isEven..\n");
    }
    else
    {
        printf("Number is Odd..\n");
    }

    /*
        if(n%2==2)
        {
            printf("Number is Even..\n");
        }
        else
        {
            printf("Number is Odd..\n");
        }
    */
    return 0;
}