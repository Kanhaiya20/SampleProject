package com.userDefinedFunctions;

public class CallByRef {
    int data = 50;

    public void change(CallByRef r){
        r.data = r.data + 100;
        System.out.println("Addition = " + r.data);
    }

    public static void main(String[] args) {
        CallByRef cbr = new CallByRef();

        System.out.println("Before change " + cbr.data);
        cbr.change(cbr);
        System.out.println("After change " + cbr.data);
    }
}
