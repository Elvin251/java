package Lesson35Practice;

abstract class Bird {
    abstract void fly();
    abstract void makeSound();
}

class Eagle extends Bird {
    void fly() { System.out.println("Eagle soars high."); }
    void makeSound() { System.out.println("Eagle screeches!"); }
}

class Hawk extends Bird {
    void fly() { System.out.println("Hawk flies swiftly."); }
    void makeSound() { System.out.println("Hawk whistles!"); }
}
