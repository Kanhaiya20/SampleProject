package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionAPIs {

    public static void main(String[] args) {
        List<Object> li = new ArrayList<>();
        li.add("B");
        li.add(12);
        li.add("C");

        int size = li.size();
        System.out.println("size = " + size);

        Iterator<Object> it = li.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
