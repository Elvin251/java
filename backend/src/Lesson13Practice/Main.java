package Lesson13Practice;

public class Main {
    public static void main(String[] args) {

        RestaurantFood food = new RestaurantFood("Toyuq kababı", 8.5, "toyuq, ədviyyat, tərəvəz");


        Order order = new Order(food, 2);
        order.showOrder();


        Bank userCard = new Bank("1234-5678-9012-3456", 20.0);  // balans 20 AZN-dir

        double totalAmount = order.calculateTotal();
        System.out.println("Ödəniləcək məbləğ: " + totalAmount + " AZN");

        if (userCard.deductAmount(totalAmount)) {
            System.out.println("Ödəniş uğurla həyata keçirildi.");
            System.out.println("Yeni balans: " + userCard.getBalance() + " AZN");
        } else {
            System.out.println("Ödəniş həyata keçirilmədi.");
        }
    }
}
