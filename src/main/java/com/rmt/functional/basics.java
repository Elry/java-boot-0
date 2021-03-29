package com.rmt.functional;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

public class Ex1{
    public static void main(String args[]){
        int [] val = {1,2,3,4,5};

        Arrays.stream(val)
          .filter(num -> num % 2 == 0)
          .map(num -> num * 2)
          .forEach(num -> System.out.println(num));
        
        immu();
        pure();
        getUser(12);

        // lambda with functional interface
        F1 a = v -> "ayyy " + v;
        System.out.println(a.getter("lmao"));

        // simple recursion
        System.out.println(fac(5));
    }

    // immutability
    private static void immu(){
      int val = 10;
      // lambda
      UnaryOperator<Integer> doubler = v -> v*2;
      
      System.out.println(val);
      System.out.println(doubler.apply(val));
    }

    // pure function
    private static void pure(){
      BiPredicate<Integer, Integer> checkVal = (val, comp) -> val > comp;

      System.out.println(checkVal.test(12, 11));
      System.out.println(checkVal.test(11, 12));
    }

    // declarative model
    private static Object getUser(int id){
      Function<Integer, Object> getWithId = userId -> new Object();
      System.out.println(getWithId.apply(12));
      return getWithId.apply(12);
    }

    private static int factorial(int val){
      if(val == 1){
        return val;
      }else{
        return val * factorial((val - 1));
      }
    }
}

@FunctionalInterface
interface F1{
  String getter(String value);
}