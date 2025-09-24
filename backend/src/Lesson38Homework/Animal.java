package Lesson38Homework;

abstract class Animal {
    String name;
    Animal(String name) { this.name = name; }
    abstract void makeNoise();
}

class Dog2 extends Animal {
    Dog2(String name) { super(name); }
    void makeNoise() { System.out.println(name + " says Woof!"); }
}

class Cat extends Animal {
    Cat(String name) { super(name); }
    void makeNoise() { System.out.println(name + " says Meow!"); }
}

 class Main14 {
    public static void main(String[] args) {
        Animal a1 = new Dog2("Rex");
        Animal a2 = new Cat("Murka");
        a1.makeNoise();
        a2.makeNoise();
    }
}
