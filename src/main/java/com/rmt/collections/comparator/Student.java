package com.rmt.collections.comparator;

public class Student implements Comparable<Student>{
  private final String name;
  private final Integer age;

  public Student(String name, Integer age){
    this.age = age;
    this.name = name;
  }

  public Integer getAge(){ return age; }
  public String getName(){ return name; }

  @Override
  public int compareTo(Student o) {
    // Ascending order
    return this.getAge()  - o.getAge();
  }
}
