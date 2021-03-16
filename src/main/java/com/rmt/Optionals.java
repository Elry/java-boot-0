package com.rmt;

import java.util.Optional;
import java.util.OptionalInt;

public class Optionals {
  public static void main(String args[]){
    Optional<String> opStr = Optional.of("value");
    opStr.ifPresentOrElse(System.out::println, () -> System.out.println("Not found"));

    Optional<String> nullOpStr = Optional.ofNullable(null);
    nullOpStr.ifPresentOrElse(System.out::println, () -> System.out.print("Null - not found"));

    Optional<String> emptyOpStr = Optional.empty();
    emptyOpStr.ifPresentOrElse(System.out::println, () -> System.out.println("Empty - not found"));

    Optional<String> nullErrOpStr = Optional.of(null);
    nullErrOpStr.ifPresentOrElse(System.out::println, () -> System.out.println("Err - not found"));

    OptionalInt.of(12).ifPresent(System.out::println);

    opStr.map((val) -> val.concat("--")).ifPresent(System.out::println);
    opStr.orElseThrow(IllegalStateException::new);
  }
}
