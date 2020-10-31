package com.inheritanceEx;

public class TestCar {
    public static void main(String[] args) {
//        Car c = new Car();
//        c.start();
//        c.stop();

        BMW b = new BMW();
        b.start();
        b.theftSafety();
        b.stop();
        System.out.println(b.model);
    }
}
