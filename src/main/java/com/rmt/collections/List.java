package com.rmt.collections;

import java.util.ArrayList;
import java.util.Collections;

public class List {
    public static void main(String args[]){
        ArrayList<String> names = new ArrayList<>();

        names.add("lmao");
        names.add("ayyy");
        names.add("heho");

        System.out.println(names);

        Collections.sort(names);
        System.out.println(names);

        names.set(2, "ayyy");
        System.out.println(names);

        names.remove(1);
        System.out.println(names);

        String name = names.get(0);
        System.out.println(name);

        System.out.println("List sizer:" + names.size());

        System.out.println("Is heho here?" + names.contains("heho"));
        
        System.out.println("Empty list?" + names.isEmpty());
        
        names.clear();
        
        System.out.println("Empty list?" + names.isEmpty());
    }
}
