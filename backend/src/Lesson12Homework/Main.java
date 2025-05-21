package Lesson12Homework;

public class Main {
    public static void main(String[] args) {
        // Mouse sinifi test
        Mouse mouse1 = new Mouse("", "Medium", "");
        mouse1.printInfo();

        Mouse mouse2 = new Mouse("Logitech", "Small", "Black");
        mouse2.printInfo();

        // Car sinifi test
        Car car1 = new Car("Toyota", "Camry", -15000, 2020, "Red");
        car1.printInfo();

        Car car2 = new Car("BMW", "X5", 60000, 2022, "Black");
        car2.printInfo();

        // Book sinifi test
        Book book1 = new Book("", "", 250, "Fiction");
        book1.printInfo();

        Book book2 = new Book("The Alchemist", "Paulo Coelho", -10, "Novel");
        book2.printInfo();

        // Phone sinifi test
        Phone phone1 = new Phone("", "Galaxy S21", 0, 128, "Silver");
        phone1.printInfo();

        Phone phone2 = new Phone("Apple", "iPhone 15", 1500, 1024, "White");
        phone2.printInfo();

        // Laptop sinifi test
        Laptop laptop1 = new Laptop("", "", 1200, 2, "Intel i5");
        laptop1.printInfo();

        Laptop laptop2 = new Laptop("Dell", "XPS 13", 950, 8, "Intel i7");
        laptop2.printInfo();
    }
}
