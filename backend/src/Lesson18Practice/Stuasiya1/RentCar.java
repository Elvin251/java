package Lesson18Practice.Stuasiya1;

public class RentCar {
    Car car;
    Double beginPayment;
    Integer month;

    public RentCar(Car car, Double beginPayment, Integer month) {
        this.car = car;
        this.beginPayment = beginPayment;
        this.month = month;
    }

    public void calculatePayment() {
        Double price = car.price;


        if (beginPayment >= price * 0.5) {
            price = price * 0.9;
            System.out.println("İlkin ödəniş 50%-dən çoxdur. 10% endirim tətbiq olundu!");
        }

        Double remaining = price - beginPayment;

        Double monthlyPayment = remaining / month;

        System.out.println("Qalan məbləğ: " + remaining);
        System.out.println("Aylıq ödəniş: " + monthlyPayment);
    }
}
