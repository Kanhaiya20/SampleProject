package com.polymorphism;

public class Car {
    public Car(){
        System.out.println("Car constructor");
    }

    public Car(int price){
        this("Skoda");
        System.out.println("Price is " + price);
    }

    public Car(String model){
        System.out.println("Model is " + model);
    }


    public static void main(String[] args) {
        new Car();
        new Car(200000);
        new Car("BMW");
    }
}
