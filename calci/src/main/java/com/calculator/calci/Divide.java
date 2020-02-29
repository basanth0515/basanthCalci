package com.calculator.calci;

class Divide{
    double a,b;
    Divide(double a,double b){
        this.a=a;
        this.b=b;
    }
    void divi(){
        try {
            if(this.b==0){
                throw new ArithmeticException();
            }
            else{
                System.out.println(this.a/this.b);
            }
            
         }
         catch (ArithmeticException e) { 
            
            System.out.println("Enter valid number other than 0");
         }
    }
}