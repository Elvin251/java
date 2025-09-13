package Lesson33Homework;

public class CMain {
    public static void main(String[] args) {
        Car c = new Car();
        c.setBrand("BMW");
        c.setModel("M3");
        c.setYear(2020);
        c.setNumber("77-ZN-909");

        System.out.println(
                c.getBrand() + " " + c.getModel() + " " + c.getYear() + " " + c.getNumber()
        );
    }
}
