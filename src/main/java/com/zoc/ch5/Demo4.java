package com.zoc.ch5;

import com.zoc.ch1.domain.Person;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo4 {
    public static void main(String[] args) {
        //1-收集集合
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("张无忌");
        nameList.add("张无忌");
        nameList.add("张无忌");
        nameList.add("张三丰");
        nameList.add("金毛狮王");
        nameList.add("张大");

        ArrayList<String> list = nameList.stream()
                .filter(s -> s.startsWith("张"))
                .map(s -> s + "的女人")
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list);

        Integer[] integers = Stream.of(4, 5, 3, 9)
                .sorted()
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(integers));

        //3-收集-并分组
        Person person1 = new Person("刘德华", 58, 174);
        Person person2 = new Person("张学友", 60, 176);
        Person person3 = new Person("郭富城", 54, 171);
        Person person4 = new Person("黎明", 53, 178);
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);

        Map<String, List<Person>> collect = persons.stream()
                .collect(Collectors.groupingBy(person -> person.getAge() >= 60 ? "老年人" : "中年人"));
        System.out.println(collect);
    }
}
