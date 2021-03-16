package com.rmt.collections;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Hashtable;

public class MapEx {
    public static void main(String args[]){
      hashMap();
      treeMap();
      hashTable();
    }

    private static void hashMap(){
        Map<String, Integer> hm = new HashMap<>();

        hm.put("a", 1);
        hm.put("b", 1);
        hm.put("b", 2);
        hm.put("c", 3);
        hm.put("d", 4);

        System.out.println("HashMap: " + hm);

        hm.put("a", 0);

        System.out.println("HashMap - after update: " + hm);
        System.out.println("HashMap - get value of key 'b': " + hm.get("b"));
        System.out.println("HashMap - has key 'd': " + hm.containsKey("d"));
        
        hm.remove("c");

        System.out.println("HashMap - has value 0: " + hm.containsValue(0));
        System.out.println("HashMap - size: " + hm.size());

        for(Map.Entry<String, Integer> entry: hm.entrySet()){
            System.out.println("HashMap - looping with entry set: " + entry);
        }

        for(String key: hm.keySet()){
            System.out.println("HashMap - looping with key set: " + key);
        }

        hm.clear();
        System.out.println("HashMap - after clear(): " + hm);
    }

    private static void treeMap(){
      // 1. order set but binary tree algorithm

      TreeMap<String, String> tm = new TreeMap<>();

      tm.put("SP", "SSP");
      tm.put("SC", "SSC");
      tm.put("MG", "SMG");

      System.out.println("TreeMap - first key:" + tm.firstKey());
      System.out.println("TreeMap - last ey:" + tm.lastKey());
      System.out.println("TreeMap - lower key:" + tm.lowerKey("SC"));
      System.out.println("TreeMap - higher key:" + tm.higherKey("SC"));
      System.out.println("TreeMap:" + tm);
      System.out.println("TreeMap - first entry key:" + tm.firstEntry().getKey());
      System.out.println("TreeMap - first entry value:" + tm.firstEntry().getValue());
    
      // last & first entries are both removed
      Map.Entry<String, String> fEntry = tm.pollFirstEntry();
      Map.Entry<String, String> lEntry = tm.pollLastEntry();

      System.out.println("TreeMap - first from poll:" + fEntry.getValue());
      System.out.println("TreeMap - last from poll:" + lEntry.getValue());
      System.out.println("TreeMap - after poll:" + tm);

      for(String s: tm.keySet()){
        System.out.println("TreeMap - loop with key set:" + s);
      }
    }

    private static void hashTable(){
      // 1. mostly usead with concurrency
      
      Hashtable<String, Integer> ht = new Hashtable<>();
      
      ht.put("a", 1);
      ht.put("b", 2);
      ht.put("c", 3);

      System.out.print(ht);

      ht.remove("b");

      System.out.println(ht);

      int val = ht.get("c");

      System.out.println(val);
      System.out.println(ht.size());
    }
}
