package Lesson27Practice.Task1;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("BMW", 2021);
        Car c3 = new Car("Audi", 2022, 35000);
        Car c4 = new Car("Toyota", 2020, 25000, "Red");

        c1.publicMethod();
        c2.protectedMethod();
        c3.defaultMethod();
        // c4.privateMethod(); // ❌ private method-a çata bilmərik

        c1.startEngine("Key123");
        System.out.println("Car count: " + Car.carCount);
    }
}
