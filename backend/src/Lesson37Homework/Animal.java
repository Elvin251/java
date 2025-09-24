package Lesson37Homework;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Bird extends Animal {
    @Override
    void sound() {
        System.out.println("Bird chirps");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class Main1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
        Animal b = new Bird();
        b.sound();
        Animal c = new Cat();
        c.sound();
    }
}

