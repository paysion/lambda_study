package com.zoc.ch1;

import com.zoc.ch1.domain.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo4 {
    public static void main(String[] args) {
        Person person1 = new Person("刘德华", 58, 174);
        Person person2 = new Person("张学友", 60, 176);
        Person person3 = new Person("郭富城", 54, 171);
        Person person4 = new Person("黎明", 53, 178);
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        Collections.sort(persons, (o1, o2) -> o1.getAge()- o2.getAge());

        persons.forEach(person -> System.out.println(person.getName() + person.getAge()));
        for (Person person: persons) {
            System.out.println(person.getName() + person.getAge());
        }
        // System.out.println(persons);
    }
}
