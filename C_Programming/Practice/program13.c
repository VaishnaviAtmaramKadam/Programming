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

    printf("Ener Number : \n");
    scanf("%d",&iValue);

   iRet =  CheckEvenOdd(iValue);
   
   if(iRet==0)
   {
    printf("Number is Even..");
   }
   else
   {
    printf("Number is Odd..");
   }
   //when function not return value so the control come in 26 line

return 0;
}
