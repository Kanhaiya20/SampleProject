package com;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random ran = new Random();
        System.out.println(ran.nextInt());
        System.out.println(ran.nextInt(100));
    }
}
