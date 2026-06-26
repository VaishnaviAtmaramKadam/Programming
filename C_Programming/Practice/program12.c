#include<stdio.h>

void CheckEvenOdd(int iNo)
{
    int iReminder = iNo % 2;

    if(iReminder==0)
    {
        printf("Number is even..");
    }
    else{
        printf("Number is odd..");
    }

}

int main()
{
    int iValue=0;

    printf("Ener Number : \n");
    scanf("%d",&iValue);

    CheckEvenOdd(iValue);//when function not return value so the control come in 26 line

return 0;
}

//check whether - when ans should be yes or no..