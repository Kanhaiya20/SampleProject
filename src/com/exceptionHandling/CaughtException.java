package com.exceptionHandling;

public class CaughtException {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("A");
        Thread.sleep(2000);
        System.out.println("B");
        Thread.sleep(2000);
        System.out.println("C");
    }
}
