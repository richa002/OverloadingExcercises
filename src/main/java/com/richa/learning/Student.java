package com.richa.learning;

public class Student {
    private String name;
    private int id;
    private String course;
    private int fee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

        if(id<0)
            return ;
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        if(fee<0)
            return ;
        this.fee = fee;
    }
    public void printDetails(){
        System.out.println("Name :"+this.name);
        System.out.println("Course :"+this.course);
        System.out.println("Id :"+this.id);
        System.out.println("fess :"+this.fee);
    }
}
