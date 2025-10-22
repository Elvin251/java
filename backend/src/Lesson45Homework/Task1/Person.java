package Lesson45Homework.Task1;

import java.util.*;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + " (" + age + ")";
    }
}

 class CustomComparatorList {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Ali", 25));
        people.add(new Person("Leyla", 20));
        people.add(new Person("Rauf", 30));

        people.sort(Comparator.comparingInt(p -> p.age));
        System.out.println("Sorted by age: " + people);
    }
}
