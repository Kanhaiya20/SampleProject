package com.basicOfJava;

public class ShortCircuitOperator {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(false || false);
    }
}

//faster than bitwise as if the first value is false, it doesnt chedck the next value (in case of AND)