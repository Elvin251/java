package Lesson27Practice.Task1;

public class Car {
    private String model;
    public int year;
    protected double price;
    String color;

    public static int carCount = 0;

    public Car() {
        carCount++;
    }


    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        carCount++;
    }


    protected Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
        carCount++;
    }
    Car(String model, int year, double price, String color) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        carCount++;
    }

    public void publicMethod() {
        System.out.println("Public method: Car year is " + year);
    }

    private void privateMethod() {
        System.out.println("Private method: Car model is " + model);
    }

    protected void protectedMethod() {
        System.out.println("Protected method: Car price is $" + price);
    }

    void defaultMethod() {
        System.out.println("Default method: Car color is " + color);
    }

    public void startEngine(final String key) {
        System.out.println("Engine started with key: " + key);
    }
}
