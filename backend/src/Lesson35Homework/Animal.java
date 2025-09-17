package Lesson35Homework;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat barks");
    }
}
 class Main1 {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.makeSound();
    }
}
