package com.inheritanceEx;

public class BMW extends Car{
    public BMW(){
        super("Maruti");
        System.out.println("BMW constructor...");
        super.model = "Skoda";

    }

    public void start(){
        System.out.println("BMW has its own way of starting");
    }

    public void theftSafety(){
        System.out.println("SPecial feature");
    }
}
