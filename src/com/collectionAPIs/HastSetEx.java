package com.collectionAPIs;

import java.util.*;

public class HastSetEx {
    public static void main(String[] args) {
        //Set s = new HashSet<>();
        //Set s = new LinkedHashSet<>();
        Set s = new TreeSet<>();
        s.add("A");
        s.add("C");
        s.add("F");
        s.add("B");
        s.add("K");

        System.out.println("Size = " + s.size());
        System.out.println(s);

//        for(Object x: s){
//            System.out.println(x);
//        }

        Iterator it = s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
