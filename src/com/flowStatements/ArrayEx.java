package com.flowStatements;

public class ArrayEx {
    public static void main(String[] args) {
        String str[] = new String[4];
        str[0]= "B";
        str[1]= "C";
        str[2]= "H";
        str[3]= "P";

        System.out.println("Size is "+ str.length);
        for(int i=0; i<str.length; i++){
            System.out.println(str[i]);
       }

     for(String x : str){
            System.out.println(x);
        }

    }
}
