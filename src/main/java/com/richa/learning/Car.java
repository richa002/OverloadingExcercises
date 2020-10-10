package com.richa.learning;

public class Car {
     private String make;
    private String  model;
    private double price;

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, String model) {
        this(make);
        this.model = model;
    }

    public Car(String make, String model, double price) {
        this(make, model);
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public void startCar(){
        System.out.println("car has started");

    }
    public void startCar(boolean startMode){
        System.out.println("Car's start mode is :"+startMode);
    }
}
