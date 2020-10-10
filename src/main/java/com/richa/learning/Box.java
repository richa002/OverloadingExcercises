package com.richa.learning;

public class Box {
    private int length;
    private int breadth;
    private int height;

    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public void printDetails(){
        System.out.println("Lenght :"+length);
        System.out.println("breadth :"+breadth);
        System.out.println("Height :" +height );
    }
    public void setHeight(int height){
        if(height<0){
            System.out.println("Height can not be negative..");
        }
        else
        this.height=height;
    }
    public int volume(){
        return length*breadth*height;
    }
    public int area(){
        return 2*(length*breadth+breadth*height+height*length);
    }
}
