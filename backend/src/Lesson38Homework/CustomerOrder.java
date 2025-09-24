package Lesson38Homework;

class CustomerOrder {
    String orderID, customer; String orderDate;
    CustomerOrder(String orderID, String customer, String orderDate) {
        this.orderID=orderID; this.customer=customer; this.orderDate=orderDate;
    }
    void show() { System.out.println("Order: " + orderID + ", Customer: " + customer); }
}

class OnlineOrder extends CustomerOrder {
    String address, tracking;
    OnlineOrder(String orderID, String customer, String orderDate, String address, String tracking) {
        super(orderID, customer, orderDate); this.address=address; this.tracking=tracking;
    }
    void show() {
        super.show();
        System.out.println("Address: " + address + ", Tracking: " + tracking);
    }
}

 class Main27 {
    public static void main(String[] args) {
        OnlineOrder o = new OnlineOrder("O123","Elsen","2025-09-24","Street 5","TRK123");
        o.show();
    }
}
