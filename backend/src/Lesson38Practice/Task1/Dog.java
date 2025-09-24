package Lesson38Practice.Task1;

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " says: Woof! 🐶");
    }
}