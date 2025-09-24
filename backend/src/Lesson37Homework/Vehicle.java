package Lesson37Homework;

class Vehicle {
    int speed = 0;
    void speedUp() {
        speed += 10;
        System.out.println("Vehicle speed: " + speed);
    }
}

class Car extends Vehicle {
    @Override
    void speedUp() {
        speed += 50;
        System.out.println("Car speed: " + speed);
    }
}

class Bicycle extends Vehicle {
    @Override
    void speedUp() {
        speed += 5;
        System.out.println("Bicycle speed: " + speed);
    }
}

class Main2 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.speedUp();
        Vehicle v2 = new Bicycle();
        v2.speedUp();
    }
}
