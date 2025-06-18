package Lesson19Practice.Stuasiya1;

public class Order {
 Product product;
   Customer customer;
 int quantity;
 Status status;

    public Order(Product product, Customer customer, int quantity) {
        this.product = product;
        this.customer = customer;
        this.quantity = quantity;
        this.status = Status.PENDING;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

    public boolean placeOrder(Bank bank) {
        double total = getTotalPrice();
        if (bank.pay(total)) {
            System.out.println("Order placed successfully!");
            return true;
        }
        System.out.println("Payment failed!");
        return false;
    }

    public void acceptOrder() {
        if (status == Status.PENDING) status = Status.ACCEPTED;
    }

    public void sentOrder() {
        if (status == Status.ACCEPTED) status = Status.SENT;
    }

    public void completeOrder() {
        if (status == Status.SENT) status = Status.COMPLETED;
    }

    public void cancelOrder() {
        if (status == Status.PENDING) status = Status.CANCELLED;
    }

    public Status getStatus() {
        return status;
    }
}
