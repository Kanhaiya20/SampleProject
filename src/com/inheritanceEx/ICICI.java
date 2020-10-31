package com.inheritanceEx;

public class ICICI implements RBI{
    @Override
    public void minBalanceForSaving() {
        System.out.println("1000");
    }

    @Override
    public void minBalanceForCurrent() {
        System.out.println("5000");
    }

    @Override
    public void rOIForSaving() {
        System.out.println("5%");
    }

    public void internationalBanking(){
        System.out.println("Special feature");
    }
}
