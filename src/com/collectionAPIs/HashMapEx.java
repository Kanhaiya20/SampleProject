package com.collectionAPIs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        //Map mp = new HashMap<>();
        Map mp = new LinkedHashMap();
        mp.put("cName","Synechron");
        mp.put("location", "Bangalore");
        mp.put("country", "India");

        Set s = mp.keySet();
        for(Object x:s){
            System.out.println(x+"==>"+mp.get(x));
        }
    }
}
