package com.exceptionHandling;

public class FinallyKeyword {
    public static void main(String[] args) {
        System.out.println("Open DB");
//        try{
//            System.out.println("Execute query..");
//            System.out.println(8/0);
//        } catch(Throwable t){
//            System.out.println(8/0);
//
//            System.out.println("catch...block");
//        }finally {
//            System.out.println("Close DB");
//        }

        throw new ArithmeticException("Divided by non-numeric value");
    }
}
