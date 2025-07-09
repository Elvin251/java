package Lesson25Practice.Task3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Mercedes");
        car.setModel("GLA 250");
        car.setYear(2022);
        car.setNumber("77-ZN-909");

        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Number: " + car.getNumber());
}

}

