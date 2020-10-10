package com.richa.learning;

public class Person {
    int age;
    String name;
    public Person(int age, String name){
        this.age=age;
        this.name=name;
    }
    public void printDetails(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }

    public static void main(String[] args) {
        Person person=new Person(19,"John");
    }
}
