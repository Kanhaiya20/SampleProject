package com.polymorphism;

public class Mobile {
    public void open(){
        System.out.println("Opened in default way");
    }

    public void open(int pwd){
        System.out.println("Opened with int pwd " + pwd);
    }

    public void open(String pwd){
        System.out.println("Opened with string pwd " + pwd);
    }

    public void open(Object pwd){
        System.out.println("Opened with object pwd " + pwd);
    }

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.open();
        m.open(4567);
        m.open("fds");
    }
}
