package Lesson38Homework;

import java.util.ArrayList;

class Course {
    String title;
    Course(String title) { this.title = title; }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) { this.name = name; }

    void addCourse(Course c) { courses.add(c); }
    void printCourses() {
        System.out.println(name + "'s Courses:");
        for (Course c : courses) System.out.println("- " + c.title);
    }
}

 class Main10 {
    public static void main(String[] args) {
        Student s = new Student("Elsen");
        s.addCourse(new Course("Math"));
        s.addCourse(new Course("Java"));
        s.printCourses();
    }
}

