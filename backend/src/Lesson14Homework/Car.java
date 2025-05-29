package Lesson14Homework;

public class Car {
    String model;
    String brand;
    int year;
    String color;
    double price;
    int credit;

    public Car(String model, String brand, int year, String color, double price, int credit) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.price = price;
        this.credit = credit;
    }

    public void getYearCategory() {
        if (year < 1995) {
            System.out.println("köhnə");
        } else if (year <= 2013) {
            System.out.println("orta");
        } else {
            System.out.println("New brand");
        }
    }

    public void calculatePriceCreditForMonth() {
        double monthly = price / credit;
        System.out.println("Aylıq ödəniş: " + monthly + " AZN");
    }

    public String toString() {
        return "Model: " + model + "\nBrand: " + brand + "\nİl: " + year +
                "\nRəng: " + color + "\nQiymət: " + price + "\nKredit: " + credit + " ay";
    }
}
