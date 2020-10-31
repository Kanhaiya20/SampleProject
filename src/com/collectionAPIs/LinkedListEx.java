package com.collectionAPIs;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<Integer> ar1 = new LinkedList<>();

        for(int i=10; i<=100; i=i+10){
            ar1.add(i);
        }

        System.out.println(ar1);

        ar1.add(2,33);
        System.out.println(ar1);

        List<Integer> ar2 = new LinkedList<>();
        ar2.add(11);
        ar2.add(22);
        ar2.add(33);

        ar1.addAll(ar2);
        ar1.addAll(2,ar2);
        System.out.println(ar1);
        long endTime = System.currentTimeMillis();
        System.out.println("Total time = " + (endTime-startTime));
    }
}
