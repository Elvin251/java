package Lesson37Homework;

class Vehicle2 {
    void startEngine() { System.out.println("Vehicle engine starts"); }
    void stopEngine() { System.out.println("Vehicle engine stops"); }
}

class Car2 extends Vehicle2 {
    @Override
    void startEngine() { System.out.println("Car engine starts with key"); }
    @Override
    void stopEngine() { System.out.println("Car engine stops with key"); }
}

class Motorcycle extends Vehicle2 {
    @Override
    void startEngine() { System.out.println("Motorcycle engine starts with button"); }
    @Override
    void stopEngine() { System.out.println("Motorcycle engine stops with button"); }
}

 class Main11 {
    public static void main(String[] args) {
        Vehicle2 car = new Car2();
        Vehicle2 bike = new Motorcycle();
        car.startEngine(); car.stopEngine();
        bike.startEngine(); bike.stopEngine();
    }
}
