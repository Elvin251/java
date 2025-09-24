package Lesson38Homework;

class Car {
    String brand;
    String model;
    int year;
    double fuel;

    Car(String brand, String model, int year, double fuel) {
        this.brand = brand; this.model = model; this.year = year; this.fuel = fuel;
    }

    void drive(double km) {
        fuel -= km * 0.1;
        System.out.println("Driving " + km + " km... Remaining fuel: " + fuel);
    }

    void refuel(double amount) { fuel += amount; }

    void printInfo() {
        System.out.println(brand + " " + model + " (" + year + ") Fuel: " + fuel);
    }
}

 class Main9 {
    public static void main(String[] args) {
        Car c = new Car("BMW", "X5", 2020, 50);
        c.printInfo();
        c.drive(100);
        c.refuel(20);
        c.printInfo();
    }
}
