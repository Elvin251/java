package Lesson38Homework;

class Animal3 {
    String type = "Animal";
    void sound() { System.out.println("Some sound"); }
}

class Dog3 extends Animal3 {
    String type = "Dog";
    void sound() {
        super.sound();
        System.out.println("Bark!");
        System.out.println("Super type: " + super.type);
    }
}

 class Main24 {
    public static void main(String[] args) {
        Dog3 d = new Dog3();
        d.sound();
    }
}
