package Lesson35Practice;

abstract class Animal2 {
    abstract void eat();
    abstract void sleep();
}

class Lion2 extends Animal2 {
    void eat() { System.out.println("Lion eats meat."); }
    void sleep() { System.out.println("Lion sleeps in the den."); }
}

class Tiger2 extends Animal2 {
    void eat() { System.out.println("Tiger hunts."); }
    void sleep() { System.out.println("Tiger sleeps in the jungle."); }
}

class Deer2 extends Animal2 {
    void eat() { System.out.println("Deer eats grass."); }
    void sleep() { System.out.println("Deer sleeps lightly."); }
}

