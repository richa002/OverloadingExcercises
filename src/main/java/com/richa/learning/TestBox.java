package com.richa.learning;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class TestBox {
    public static void main(String[] args) {
       /*
        Box box=new Box(2,4,6);
        box.printDetails();
        System.out.println("AREA :"+ box.area());
        System.out.println("Volume :"+box.volume());
        box.setHeight(12);
        box.printDetails();

        Student student=new Student();
        student.setId(1);
        student.setName("Richa");
        student.setCourse("Java");
        student.setFee(2000);
        student.printDetails();



        Calculator c=new Calculator();
      System.out.println(c.sum(1,5.6));
        System.out.println( c.divide(6,2));
        System.out.println(c.divide(7.4,2));
        System.out.println(c.divide(2,0));

        */
        for ( char c='A'; c <= 'E'; c++ ){
            for ( int n=1; n <= 3; n++ ){
                System.out.println( c + " " + n );
            }
        }System.out.println("\n");// this is #2 -I'll call
Game game=new Game();
        System.out.println(game.playGame("richa"));
        System.out.println(game.playGame("richa", "poo"));
        System.out.println(game.playGame("a","bc","abc"));
    }
}
