package az.developia.demo2.Lesson48Homework.com.example.demo;


import org.springframework.stereotype.Component;

@Component
public class Car {

    private String brand;
    private String model;
    private int year;
    private double price;

    public Car() {
        this.brand = "Toyota";
        this.model = "Camry";
        this.year = 2022;
        this.price = 45000.0;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
