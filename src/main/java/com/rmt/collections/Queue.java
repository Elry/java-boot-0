package com.rmt.collections;

import java.util.Queue;

public class Queue {
  Queue<String> que = new LinkedList<>();
  
  que.add("heho");
  que.add("ayy");
  que.add("lmao");

  // returns first element and removes
  String firstOut = que.poll();

  System.out.println(firstOut);

  // returns first element without removing it
  String firstIn = que.peek();
  System.out.println("first" + firstIn);

  for(String q: que){
      System.out.println(q);
  }

  Iterator<String> iQ = que.iterator();

  while(iQ.hasNext()){
      System.out.println(iQ.next());
  }

  System.out.println(que.size());
}
