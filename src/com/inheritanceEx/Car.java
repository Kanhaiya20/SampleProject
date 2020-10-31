package com.inheritanceEx;

public class Car {

    public String model;
    public Car(){
        System.out.println("Car constructor...");
    }

    public Car(String model){
        System.out.println("The model is "+ model);
    }

    public void start(){
        System.out.println("Car starts...");
    }

    public void stop(){
        System.out.println("Car stops....");
    }

}
