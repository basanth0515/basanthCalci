package com.calculator.calci;
import java.util.Scanner;
class Calculator1{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Simple Calculator\nOption ADD to ADD two numbers\nOption SUB to SUBSTRACT two nubers\nOption MUL to MULTIPLY two numbers\nOption DIV to DIVIDE two numbers\n Option EXIT to exit the calcultor");
            System.out.print("Enter your opion ");
            String option=sc.next();
            switch(option){
                case "ADD":
                    System.out.print("Enter number one ");
                    double n1=sc.nextDouble();
                    System.out.print("Enter number two ");
                    double n2=sc.nextDouble();
                    Add ad=new Add(n1,n2);
                    ad.add();
                    break;
                case "SUB":
                    System.out.print("Enter number one ");
                    double n3=sc.nextDouble();
                    System.out.print("Enter number two ");
                    double n4=sc.nextDouble();
                    Substract sb=new Substract(n3, n4);
                    sb.sub();
                    break;
                case "MUL":
                    System.out.print("Enter number one ");
                    double n5=sc.nextDouble();
                    System.out.print("Enter number two ");
                    double n6=sc.nextDouble();
                    Multiply m = new Multiply(n5, n6);
                    m.mul();
                    break;
                case "DIV":
                    System.out.print("Enter number one ");
                    double n7=sc.nextDouble();
                    System.out.print("Enter number two ");
                    double n8=sc.nextDouble();
                    Divide d = new Divide(n7, n8);
                    d.divi();
                    break;
                case "EXIT":
                	sc.close();
                    return ;
                default :
                    System.out.println("Enter valid option");
            }
        }
        
    }

}