package Lesson34Practice.Task1;

class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void printInfo() {
        System.out.println("Marka: " + brand + ", Sürət: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Yanacaq: " + fuelType);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brand, int speed, String fuelType, int batteryCapacity) {
        super(brand, speed, fuelType);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Batareya tutumu: " + batteryCapacity + " kWh");
    }
}
