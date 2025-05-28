package Lesson14;

public class Car {
    String brand;
    int year;

    public Car() {
        this.brand = "Unknown";
        this.year = 0;
    }

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void printInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.printInfo();


        Car car2 = new Car("Toyota", 2022);
        car2.printInfo();
    }
}
