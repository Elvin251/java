package Lesson19Practice.Stuasiya1;

public class Main {
    public static void main(String[] args) {
        User user = new User("elvin123", "elvin@mail.com", "1234");
        Customer customer = new Customer("Elvin", "Memmedov", user);
        Category cat = new Category("Electronics");
        Product phone = new Product("iPhone", 1800, "New iPhone", "Apple", cat);
        Bank bank = new Bank("123456789", 2000);

        Order order = new Order(phone, customer, 1);

        if (order.placeOrder(bank)) {
            order.acceptOrder();
            order.sentOrder();
            order.completeOrder();

            Rating rating = new Rating(order, customer);
            rating.addRating(4.5);
        }

        System.out.println("Remaining balance: " + bank.getBalance());
        System.out.println("Order status: " + order.getStatus());
    }
}
