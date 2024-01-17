package com.zoc.ch4;

import com.zoc.ch1.domain.Person;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Demo1 {
    public static void main(String[] args) {
        // Function<String,String> function = s -> s.toUpperCase();
        Function<String,String> function = String::toUpperCase;
        System.out.println(function.apply("hello world!"));

        // 类名::静态方法
        // Supplier<Long> supplier = () -> System.currentTimeMillis();
        Supplier<Long> supplier = System :: currentTimeMillis;
        System.out.println(supplier.get());

        // BiFunction<String,Integer,Person> biFunction = (s, integer) -> new Person(s,integer);
        BiFunction<String,Integer,Person> biFunction = Person::new;
        System.out.println(biFunction.apply("zoc", 18));
    }

}
