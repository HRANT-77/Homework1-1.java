package com.company.ex1;

public class Calculator {
    public double Add(double a, double b){ return a+b; }
    public double Subtract(double a, double b){
        return a-b;
    }
    public double Multiply(double a, double b){
        return a*b;
    }
    public double Divide(double a, double b){
        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
        }
        catch(ArithmeticException ar){
            System.out.println("You cannot divide by 0");
        }
        return a/b;
    }
}
