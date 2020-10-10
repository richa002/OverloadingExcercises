package com.richa.learning;

public class Main {
    public static void main(String[] args) {
     /*   IEnjoy obj=new IEnjoy() {
            public void enjoy() {
                System.out.println("I am ENJOYING");
            }
        };
        obj.enjoy();



      */

        IEnjoy obj=()-> System.out.println("I am enjoying with lambdas");
ILogger obj1=(logLevel, msg) ->"this is "+logLevel +"with msg :"+msg;
 obj.enjoy();
 obj1.log("3","this is log level 3 msg");
 
    }
}
