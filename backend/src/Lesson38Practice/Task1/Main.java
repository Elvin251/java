package Lesson38Practice.Task1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Misty", 3);
        Dog dog = new Dog("Rex", 5);
        Lion lion = new Lion("Simba", 7);

        cat.displayInfo();
        cat.makeNoise();

        dog.displayInfo();
        dog.makeNoise();

        lion.displayInfo();
        lion.makeNoise();
    }
}
