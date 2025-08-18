package Yaytapsiriqlari.Task4.Bolt;

public class Order {
    private Food food;
    private int quantity;
    private Address address;
    private Customer customer;
    private Status status;

    public Order(Food food, int quantity, Address address, Customer customer, Status status) {
        this.food = food;
        this.quantity = quantity;
        this.address = address;
        this.customer = customer;
        this.status = status;
    }

    public double getTotalPrice() {
        return food.getPrice() * quantity;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "food=" + food +
                ", quantity=" + quantity +
                ", totalPrice=" + getTotalPrice() +
                ", address=" + address +
                ", customer=" + customer +
                ", status=" + status +
                '}';
    }
}
