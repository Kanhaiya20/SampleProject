package com.basicOfJava;

public class Car {
    String model;
    int price;
    int wheels;

    public static void main(String[] args) {
        Car a = new Car();

        a.model = "BMW";
        a.price = 20000;
        a.wheels = 4;

        System.out.println("The model name is " + a.model);
        System.out.println("Price = " + a.price);
        System.out.println("Wheels = " + a.wheels);
    }
}
