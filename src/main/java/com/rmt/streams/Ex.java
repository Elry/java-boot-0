package com.rmt.streams;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Ex {
  public static void main(String args[]){
    List<String> cls = new ArrayList<>();

    cls.add("Alice");
    cls.add("Trumpter");
    cls.add("Hitoshura");
    cls.add("Demifiend");

    System.out.println("Stream: " + cls.stream().count());
    System.out.println("Stream: " + cls.stream().max(Comparator.comparingInt(String::length)));
    System.out.println("Stream: " + cls.stream().min(Comparator.comparingInt(String::length)));
    System.out.println("Stream: " + cls.stream().filter((cl) -> cl.toLowerCase().contains("h")).collect(Collectors.toList()));
    System.out.println("Stream: " + cls.stream().map(cl -> cl.concat(" - ").concat(String.valueOf(cl.length()))).collect(Collectors.toList()));
    System.out.println("Stream: " + cls.stream().limit(3).collect(Collectors.toList()));
    System.out.println("Stream: " + cls.stream().peek(System.out::println).collect(Collectors.toList()));
    cls.stream().forEach(System.out::println);
    System.out.println("Stream: " + cls.stream().allMatch((cl) -> cl.contains("a")));
    System.out.println("Stream: " + cls.stream().anyMatch((cl) -> cl.contains("a")));
    System.out.println("Stream: " + cls.stream().noneMatch((cl) -> cl.contains("a")));
    cls.stream().findFirst().ifPresent(System.out::println);
  }
}
