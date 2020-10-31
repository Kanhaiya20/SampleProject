package com.collectionAPIs;

public class StringMethod {
    public static void main(String[] args) {
        String str = "Bangalore is too cold nowadays";

        System.out.println(str.length());
        System.out.println(str.equals("bangalore is too cold nowadays"));
        System.out.println(str.equalsIgnoreCase("bangalore is too cold nowadays"));
        System.out.println(str.isEmpty());
        System.out.println(str.contains("too"));
        System.out.println(str.replace("Bangalore", ""));
    }
}
