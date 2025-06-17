package Lesson18Homework.Task2;

public class Student {
    String name;
    boolean hasDebt;

    public Student(String name, boolean hasDebt) {
        this.name = name;
        this.hasDebt = hasDebt;
    }

    public boolean isEligible() {
        return !hasDebt;
    }
}
