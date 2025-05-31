package Lesson15Practice.Contructurlar;

public class Cat {

    String name;
    int age;

    public Cat() {
        name = "Unknown";
        age = 0;
    }

    public void displayInfo() {
        System.out.println("Cat name: " + name);
        System.out.println("Cat age: " + age);
    }


    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.displayInfo();
    }
}
