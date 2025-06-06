package Lesson16Homework.Task20;

public class TeachMarket {
    public static void main(String[] args) {
        Product product = new Product("Noutbuk", 1200, 5);
        Customer customer = new Customer("Azər Məmmədov", 3000);

        int quantity = 2;
        double total = product.price * quantity;
        double discountedTotal = Compony.applyDiscount(total);

        System.out.println("Alış-veriş toplam: " + total + " AZN");
        System.out.println("Endirimli toplam: " + discountedTotal + " AZN");

        if (product.stock >= quantity && customer.makePayment(discountedTotal)) {
            product.reduceStock(quantity);
            System.out.println("Satış uğurla başa çatdı.");
            System.out.println("Yeni balans: " + customer.balance + " AZN");
            System.out.println("Yeni stok: " + product.stock + " ədəd");
        } else {
            System.out.println("Satış mümkün olmadı. Ya balans çatmır, ya stok azdır.");
        }
    }
}
