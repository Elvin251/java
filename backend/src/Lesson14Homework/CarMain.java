package Lesson14Homework;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Camry", "Toyota", 2020, "qara", 30000, 30);
        System.out.println(car);
        car.getYearCategory();
        car.calculatePriceCreditForMonth();
    }
}
