package Lesson20Homework.Stuasiya;

public class Main {
    public static void main(String[] args) {

        Address address = new Address("Azərbaycan", "Bakı", "28 May, blok 5");
        Customer customer = new Customer("Elvin", "Əliyev", "+994501234567");
        Food food = new Food("Burger", "Ətli, pendirli, tərəvəzli", 6.5);
        Bank bank = new Bank("1234 5678 9012 3456", 50);

        Order order = new Order(food, 2, address, customer, Status.PENDING);
        order.printOrderInfo();

        double total = order.calculateTotal();
        System.out.println("Ödəniş olunur...");

        if (bank.makePayment(total)) {
            System.out.println("Ödəniş uğurla tamamlandı. Qalan balans: " + bank.getBalance() + " ₼");
        } else {
            System.out.println("Ödəniş alınmadı. Balans kifayət etmir.");
        }
    }
}
