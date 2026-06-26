#include<stdio.h>

int CheckEvenOdd(int iNo)
{
    int iReminder = iNo % 2;

    return iReminder;

}

int main()
{
    int iValue=0;
    int iRet=0;

    printf("Ener Number to check wheteher no is enev or odd : ");
    scanf("%d",&iValue);

   iRet =  CheckEvenOdd(iValue);
   
   if(iRet==0)
   {
    printf("%d is Even..",iValue);
   }
   else
   {
    printf("%d is Odd..",iValue);
   }
   //when function not return value so the control come in 26 line

return 0;
}

