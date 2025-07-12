package Lesson26Practice.Task2;

public class Main {
    public static void main(String[] args) {
        Brand brand = new Brand();
        brand.name = "Toyota";

        Model model = new Model();
        model.name = "Corolla";

        Car car = new Car();
        car.setBrand(brand);
        car.setModel(model);
        car.setPrice(28000);
        car.setYear(2022);

        brand.printInfo();
        model.printInfo();
        System.out.println("Car Price: $" + car.getPrice());
        System.out.println("Car Year: " + car.getYear());
    }}
