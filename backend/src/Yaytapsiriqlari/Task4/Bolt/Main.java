package Yaytapsiriqlari.Task4.Bolt;
public class Main {
    public static void main(String[] args) {
        // Müştəri və ünvan
        Customer customer = new Customer("Elvin", "Mammadov", "+994501234567");
        Address address = new Address("Azerbaijan", "Baku", "Nizami küçəsi 45");

        // Yemək menyusu
        Food food1 = new Food("Burger", "Mal əti, pendir, tərəvəz", 8.5);
        Food food2 = new Food("Pizza", "Mozzarella, pepperoni, zeytun", 12.0);

        // Bank hesabı
        Bank bank = new Bank("1234-5678-9999-0000", 50);

        // Sifariş
        Order order = new Order(food2, 2, address, customer, Status.PENDING);
        System.out.println("Yeni sifariş: " + order);

        // Ödəniş və sifariş statusu
        if (bank.pay(order.getTotalPrice())) {
            order.setStatus(Status.ACCEPTED);
        } else {
            order.setStatus(Status.CANCELLED);
        }

        System.out.println("Son nəticə: " + order);
    }
}
