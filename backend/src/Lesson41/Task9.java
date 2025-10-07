package Lesson41;

import java.util.*;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Task9 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Elsen", 20),
                new Person("Ali", 16),
                new Person("Nigar", 25)
        );

        people.stream()
                .filter(p -> p.age > 18)
                .map(p -> p.name)
                .forEach(System.out::println);
    }
}
