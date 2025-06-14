package Lesson18Practice.Stuasiya1;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("4169738890123456", 10000.0);
        Car car = new Car("Toyota", "Corolla", 20000.0, 2022);
        Customer customer = new Customer("Elvin", "Huseynov", bank);
        RentCar rentCar = new RentCar(car, 10000.0, 10);

        rentCar.calculatePayment();
    }
}
