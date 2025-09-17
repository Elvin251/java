package Lesson35Homework;

class Vehicle {
    public void drive() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}

 class Main2 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.drive();
    }
}
