package com.encapsulation;

public class MyAccount {
    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAccountNum() {
        return AccountNum;
    }

    public void setAccountNum(int accountNum) {
        AccountNum = accountNum;
    }

    private String fname;
    private String lname;
    private int AccountNum;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
}
