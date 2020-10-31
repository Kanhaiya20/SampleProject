package com.userDefinedFunctions;

public class CallByValue {
    int data = 50;

    public void change(int data){
        data=data+100;
        System.out.println("Addition = " + data);
    }

    public static void main(String[] args) {
        CallByValue cbv = new CallByValue();

        System.out.println("Before change " + cbv.data);
        cbv.change(500);
        System.out.println("After change " + cbv.data);
    }
}
