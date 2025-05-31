package Lesson15Practice.Contructurlar;

public class Dog {

    String name;
    String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Dog name: " + name);
        System.out.println("Dog color: " + color);
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Brown");
        myDog.displayInfo();
    }
}
