package Lesson35Homework;

class Vehicle2 {
    String make, model, fuelType;
    int year;

    Vehicle2(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public double fuelEfficiency() {
        return 0.0;
    }

    public double maxSpeed() {
        return 0.0;
    }
}

class Truck extends Vehicle2 {
    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double fuelEfficiency() {
        return 8.5;
    }

    @Override
    public double maxSpeed() {
        return 120;
    }
}

class Car2 extends Vehicle2 {
    Car2(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double fuelEfficiency() {
        return 15.0;
    }

    @Override
    public double maxSpeed() {
        return 200;
    }
}

class Motorcycle extends Vehicle2 {
    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double fuelEfficiency() {
        return 30.0;
    }

    @Override
    public double maxSpeed() {
        return 220;
    }
}

 class Main9 {
    public static void main(String[] args) {
        Vehicle2 v1 = new Truck("Volvo", "FH16", 2020, "Diesel");
        Vehicle2 v2 = new Car2("BMW", "M5", 2022, "Petrol");
        Vehicle2 v3 = new Motorcycle("Yamaha", "R1", 2021, "Petrol");

        System.out.println(v1.make + " efficiency: " + v1.fuelEfficiency());
        System.out.println(v2.make + " efficiency: " + v2.fuelEfficiency());
        System.out.println(v3.make + " efficiency: " + v3.fuelEfficiency());
    }
}
