#include<iostream>
using namespace std;

#pragma pack(1)

class ArrayX
{
    private:
    int *Arr;
    int iSize;

    public: 
    
    //Parameterised constructor with default Rgument
    ArrayX(int X=5)      
    {
        int iSize=X;
        Arr=new int[iSize];
    
    }
    ~ArrayX()
    {
    
        delete []Arr;
    }
};

int main()
{
    ArrayX*aobj1=new ArrayX();  //parametrised constructor 
    ArrayX*aobj2=new ArrayX(15);  //parametrised constructor

    //function call)
    

    
    delete aobj1;  
    delete aobj2;

    return 0;
}