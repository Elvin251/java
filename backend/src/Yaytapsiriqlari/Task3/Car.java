package Yaytapsiriqlari.Task3;
public class Car {
    private String model;
    private String brand;
    private int year;
    private String color;
    private double price;
    private int creditMonths;

    public Car(String model, String brand, int year, String color, double price, int creditMonths) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.price = price;
        this.creditMonths = creditMonths;
    }

    public String getYearCategory() {
        if (year < 1995) return "Köhnə";
        else if (year <= 2013) return "Orta";
        else return "New brand";
    }

    public double calculatePriceCreditForMonth() {
        return price / creditMonths;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", il=" + year +
                ", rəng='" + color + '\'' +
                ", qiymət=" + price +
                ", kredit=" + creditMonths + " ay" +
                ", İl kateqoriyası=" + getYearCategory() +
                ", Aylıq ödəniş=" + calculatePriceCreditForMonth() +
                '}';
    }
}
