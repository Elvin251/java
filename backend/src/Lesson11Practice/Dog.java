package Lesson11Practice;

public class Dog {
     String name;
     int age;


    public Dog(String n, int a) {
        name = n;
        age  = a;
    }
    public void bark() {
        System.out.println("Dog bark");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
