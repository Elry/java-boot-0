package com.rmt.collections.comparator;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class StudentList {
  public static void main(String args[]){
    List<Student> st = new ArrayList<>();

    st.add(new Student("ayyy", 1));
    st.add(new Student("lmao", 3));
    st.add(new Student("heho", 2));
    st.add(new Student("hitoshura", 0));

    System.out.println("Initial order: " + st);

    // with lambda, low coupling
    st.sort((first, second) -> first.getAge() - second.getAge());
    System.out.println("Ascending order - Lambda: " + st);

    st.sort((first, second) -> second.getAge() - first.getAge());
    System.out.println("Descending order - Lambda: " + st);

    // with reference
    st.sort(Comparator.comparingInt(Student::getAge));
    System.out.println("Ascending order - Reference: " + st);
    
    st.sort(Comparator.comparingInt(Student::getAge).reversed());
    System.out.println("Descending order - Reference: " + st);

    // with comparator coupling
    Collections.sort(st);
    System.out.println("Ascending order - Comparator:" + st);

    Collections.sort(st, new StudentReverse());
    System.out.println("Descending order - Comparator:" + st);
  }
}
