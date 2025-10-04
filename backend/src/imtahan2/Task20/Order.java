package imtahan2.Task20;

class Order {
    Food food;
    int quantity;
    Address address;
    Customer customer;
    Status status;

    Order(Food food, int quantity, Address address, Customer customer, Status status) {
        this.food = food;
        this.quantity = quantity;
        this.address = address;
        this.customer = customer;
        this.status = status;
    }

    void showOrder() {
        System.out.println("Müştəri: " + customer.name + " " + customer.surname);
        System.out.println("Yemək: " + food.name + " (" + quantity + " ədəd)");
        System.out.println("Qiymət: " + (food.price * quantity) + " AZN");
        System.out.println("Ünvan: " + address.city + ", " + address.address);
        System.out.println("Status: " + status);
    }
}
