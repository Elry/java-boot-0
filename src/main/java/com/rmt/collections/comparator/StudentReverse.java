package com.rmt.collections.comparator;

import java.util.Comparator;

public class StudentReverse implements Comparator<Student>{
  // Descending order
  @Override
  public int compare(Student o1, Student o2) {
    return o2.getAge() - o1.getAge();
  }
}
