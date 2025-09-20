package Lesson36Homework;

interface Animal {
    void bark();
}

class Dog implements Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

 class Main2 {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.bark();
    }
}

