package com.polymorphism;

public class Ccar {
    String model;
    int price;

    public Ccar(String model, int price){
        this.model=model;
        this.price=price;
    }

    public static void main(String[] args) {
        Ccar c = new Ccar("BMW", 20000);
        System.out.println("Model is " + c.model);
        System.out.println("Price is " + c.price);

        Ccar d = new Ccar("Skoda", 15000);
        System.out.println("Model is " + d.model);
        System.out.println("Price is " + d.price);
    }
}
