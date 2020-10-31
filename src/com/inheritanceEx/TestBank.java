package com.inheritanceEx;

public class TestBank {
    public static void main(String[] args) {
        RBI i = new ICICI();
        i.minBalanceForSaving();
        i.minBalanceForCurrent();
        i.rOIForSaving();
        //i.internationalBanking();

        ICICI r = new ICICI();
        r = (ICICI) i;
        r.internationalBanking();
    }
}