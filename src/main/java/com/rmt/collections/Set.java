package com.rmt.collections;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class Set {
    public static void main(String args[]){
        hashSet();
        linkedHashSet();
        treeSet();
    }

    public static void hashSet(){
        // 1. order does not matter
        // 2. cannot have repeated values
        // 3. does not allow order manipulation
        // 4. Add/Remove normally
        // 5. does not allow updates or search by item
        // 6. mostly optimized to read all
        // 7. not indexed

        HashSet<Double> scoreStudent = new HashSet<>();

        scoreStudent.add(0.1);
        scoreStudent.add(1.1);
        scoreStudent.add(2.1);
        scoreStudent.add(3.1);
        scoreStudent.add(4.1);
        scoreStudent.add(5.1);
        scoreStudent.add(6.1);

        System.out.println("HashSet: " + scoreStudent);

        scoreStudent.remove(3.1);

        System.out.println("HashSet: " + scoreStudent);
        System.out.println("HashSet: " + scoreStudent.size());

        for(Double score: scoreStudent){
            System.out.println("HashSet: " + score);
        }

        scoreStudent.clear();

        System.out.println("HashSet: " + scoreStudent);
    }

    public static void treeSet(){
        // 1. can alter the order
        // 2. similar to binary tree
        // 4. reading is fast
        // 3. the ordenation algorithm is applied everytime something changes, thus update is slower
        
        TreeSet<String> ts = new TreeSet<>();

        ts.add("Ayy");
        ts.add("Lmao");
        ts.add("Heho");
        ts.add("Aoo");

        System.out.println("TreeSet: " + ts);
        System.out.println("TreeSet: " + ts.first());
        System.out.println("TreeSet: " + ts.last());
        System.out.println("TreeSet: " + ts.lower("Lmao"));
        System.out.println("TreeSet: " + ts.higher("Lmao"));
        System.out.println("TreeSet: " + ts.pollFirst());
        System.out.println("TreeSet: " + ts.pollLast());
    }

    public static void linkedHashSet(){
        // 1. keeps insertion order
        LinkedHashSet<Double> lhs = new LinkedHashSet<>();

        lhs.add(0.1);
        lhs.add(1.1);
        lhs.add(2.1);
        lhs.add(3.1);
        lhs.add(4.1);

        System.out.println("LinkedHashSet: " + lhs);
        System.out.println("LinkedHashSet: " + lhs.size());
        System.out.println("LinkedHashSet: " + lhs.isEmpty());

        for(Double lh: lhs){
            System.out.println("LinkedHashSet: " + lh);
        }

        lhs.remove(0.1);
        System.out.println("LinkedHashSet: " + lhs);
        
        lhs.clear();
        System.out.println("LinkedHashSet: " + lhs.isEmpty());
    }
}
