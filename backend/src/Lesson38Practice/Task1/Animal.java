package Lesson38Practice.Task1;

abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeNoise();

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}