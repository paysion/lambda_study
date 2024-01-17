package com.zoc.ch3;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo3 {
    public static void main(String[] args) {
        Supplier<Long> supplier = () -> System.currentTimeMillis();
        System.out.println(supplier.get());

        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        consumer.accept("hello world!");

        Predicate<String> predicate = s -> s.contains("h");
        System.out.println(predicate.test("hello"));

        BiFunction<String,String,String> biFunction = (s1, s2) -> s1 + " " + s2;
        System.out.println(biFunction.apply("hello", "world"));
    }
}
