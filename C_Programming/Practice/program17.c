#include<stdio.h>
#include<stdbool.h>//c mdhe bool nahiye mhnun hi file use karaychi so aapan use kru shkto

bool CheckEvenOdd(int iNo)
{
  
    if( iNo % 2==0)
    {
        return true;
    }
    else
    {
        return false;
    }
 }

int main()
{
    int iValue=0;
    bool bRet=false; // false - defailt value-false means 0 true mrans 1

    printf("Ener Number to check wheteher no is enev or odd : ");
    scanf("%d",&iValue);
   
   if(CheckEvenOdd(iValue))
   {
    printf("\n%d is Even..",iValue);
   }
   else
   {
    printf("\n%d is Odd..",iValue);
   }

return 0;
}

