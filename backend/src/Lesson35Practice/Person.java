package Lesson35Practice;

abstract class Person {
    abstract void eat();
    abstract void exercise();
}

class Athlete extends Person {
    void eat() { System.out.println("Athlete eats healthy food."); }
    void exercise() { System.out.println("Athlete trains daily."); }
}

class LazyPerson extends Person {
    void eat() { System.out.println("Lazy person eats junk food."); }
    void exercise() { System.out.println("Lazy person rarely exercises."); }
}
