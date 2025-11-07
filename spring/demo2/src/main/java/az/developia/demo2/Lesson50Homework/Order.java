package az.developia.demo2.Lesson50Homework;


public class Order {
    private Long id;
    private String customerName;
    private Double totalAmount;
    private OrderStatus status;

    public Order() {}

    public Order(Long id, String customerName, Double totalAmount, OrderStatus status) {
        this.id = id;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.status = status;
    }


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public Double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(Double totalAmount) { this.totalAmount = totalAmount; }

    public OrderStatus getStatus() { return status; }
    public void setStatus(OrderStatus status) { this.status = status; }
}
