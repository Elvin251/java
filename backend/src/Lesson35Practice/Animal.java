package Lesson35Practice;

abstract class Animal {
    abstract void sound();
}

class Lion extends Animal {
    @Override
    void sound() {
        System.out.println("Lion roars!");
    }
}

class Tiger extends Animal {
    @Override
    void sound() {
        System.out.println("Tiger growls!");
    }
}
