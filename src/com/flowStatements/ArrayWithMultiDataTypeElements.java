package com.flowStatements;

public class ArrayWithMultiDataTypeElements {
    public static void main(String[] args) {
        Object obj[] = new Object[4];
        obj[0] = "Bangalore";
        obj[1] = 23;
        obj[2] = false;
        obj[3] = 23.44;

        System.out.println("size is " + obj.length);
        for(Object x: obj){
            System.out.println(x);
        }
    }
}