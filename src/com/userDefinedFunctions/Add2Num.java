package com.userDefinedFunctions;

public class Add2Num {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        System.out.println("A");
        int total_sum = sum(a,b)+50;
        System.out.println(sum(a,b));
        System.out.println(total_sum);
        System.out.println("B");
    }

    private static int sum(int x, int y) {
        return x+y;
    }
}
