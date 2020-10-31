package com.staticExample;

public class Car {
    String model;
    int p;
    static int wheels;

    public static void main(String[] args) {
        System.out.println("wheels="+wheels);
        Car c = new Car();
        c.testforStatic();
        System.out.println(c.model);
    }

    private void testforStatic() {
        System.out.println("test for static");
    }
}
