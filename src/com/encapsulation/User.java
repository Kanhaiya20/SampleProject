package com.encapsulation;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

public class User {
    public static void main(String[] args) {
        MyAccount ma = new MyAccount();
        ma.setFname("Kanhaiya");
        ma.setLname("Agarwal");
        ma.setAccountNum(4678);

        System.out.println("First name " + ma.getFname());
        System.out.println("Last name " + ma.getLname());
        System.out.println("Account number " + ma.getAccountNum());
    }
}
