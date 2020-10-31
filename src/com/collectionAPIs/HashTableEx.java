package com.collectionAPIs;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable<>();

        ht.put("cName", "Synechron");
        ht.put("pincode", 12345);
        ht.put("location", "Hyd");
        ht.put("country", 123);

        System.out.println(ht.get("cName"));
        System.out.println(ht.get("location"));
        System.out.println(ht.get("country"));

        Enumeration k = ht.keys();
        Enumeration e = ht.elements();
        while(k.hasMoreElements()){
            System.out.println(k.nextElement() + "==>" + e.nextElement());
        }
    }
}
