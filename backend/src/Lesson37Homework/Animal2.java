package Lesson37Homework;

class Animal2 {
    void move() { System.out.println("Animal moves"); }
    void makeSound() { System.out.println("Animal sound"); }
}

class Bird2 extends Animal2 {
    @Override
    void move() { System.out.println("Bird flies"); }
    @Override
    void makeSound() { System.out.println("Bird chirps"); }
}

class Panthera extends Animal2 {
    @Override
    void move() { System.out.println("Panthera walks silently"); }
    @Override
    void makeSound() { System.out.println("Panthera growls"); }
}

 class Main7 {
    public static void main(String[] args) {
        Animal2 b = new Bird2();
        Animal2 p = new Panthera();
        b.move();
        b.makeSound();
        p.move();
        p.makeSound();
    }
}
