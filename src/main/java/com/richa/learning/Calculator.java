package com.richa.learning;

public class Calculator {
 public int sum(int a, int b){
     return a+b;

 }
 public double sum(double a, double b){
     return a+b;

 }
 public int subraction(int a, int b){
     return a-b ;
 }
 public double subtraction(double a, double b){
     return a-b;
 }
    public int multipy(int a, int b){
        return a*b ;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public double divide(int a, int b){
       try{
        return a/b ;}catch(Exception e){
    System.out.println("cant divide by 0");
       }
return 0.0;
    }

    public double divide(double a, double b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println("cant divide by 0");
        }
        return 0.0;

    }
}
