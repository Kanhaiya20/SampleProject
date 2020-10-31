package com.userDefinedFunctions;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("A"); //function call
        login();
        System.out.println("B");
        login();
        System.out.println("C");
        login();
        System.out.println("D");

    }
    //function definition
    public static void login(){
        System.out.println("login statements");
    }

}
