package Lesson45Homework.Task1;

import java.util.*;

class Student {
    String id;
    String name;

    Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student s = (Student) obj;
        return id.equals(s.id);
    }

    public String toString() {
        return name + " (" + id + ")";
    }
}

 class MapCustomObjects {
    public static void main(String[] args) {
        HashMap<Student, Integer> scores = new HashMap<>();
        scores.put(new Student("S1", "Ali"), 90);
        scores.put(new Student("S2", "Leyla"), 85);
        scores.put(new Student("S1", "Ali Duplicate"), 95); // same ID, overrides

        System.out.println("Student Scores: " + scores);
    }
}
