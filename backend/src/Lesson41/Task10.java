package Lesson41;

import java.util.*;
import java.util.Comparator;

class Person2 {
    String name;
    int age;
    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Task10 {
    public static void main(String[] args) {
        List<Person2> people = Arrays.asList(
                new Person2("Elsen", 25),
                new Person2("Ali", 20),
                new Person2("Aysel", 20),
                new Person2("Murad", 30)
        );

        people.stream()
                .sorted(Comparator.comparing((Person2 p) -> p.age)
                        .thenComparing(p -> p.name))
                .forEach(p -> System.out.println(p.name + " - " + p.age));
    }
}
