package com.basicOfJava;

public class Ccar {
    String model;

    public static void main(String[] args) {
        Ccar a = new Ccar();
        Ccar b = new Ccar();
        Ccar c = new Ccar();

        a.model = "BMW";
        b.model = "Skoda";
        c.model = "Maruti";

        System.out.println("The model name is " + a.model);
        System.out.println("The model name is " + b.model);
        System.out.println("The model name is " + c.model);

        a=b;
        b=c;
        c=a;

        System.out.println("The model name is " + a.model);
        System.out.println("The model name is " + b.model);
        System.out.println("The model name is " + c.model);
    }
}
