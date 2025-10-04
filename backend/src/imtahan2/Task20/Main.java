package imtahan2.Task20;

public class Main {
    public static void main(String[] args) {
        Food f1 = new Food("Big Mac Menyu", "Coca Cola və kartof fri ilə", 12.5);
        Food f2 = new Food("Pepperoni Pizza", "30 sm, əlavə pendir", 15.0);
        Food f3 = new Food("Sushi Set", "16 ədəd sushi və soya sousu", 22.0);

        Address a1 = new Address("Azerbaijan", "Baku", "Yasamal, Elmlar, Mətbuat prospekti 15");
        Bank b1 = new Bank("4169 7755 0023 4577", 100);
        Customer c1 = new Customer("Murad", "Azayev", "0507773344");

        Order o1 = new Order(f1, 1, a1, c1, Status.ACCEPTED);
        o1.showOrder();
}
}