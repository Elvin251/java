package Lesson34Practice.Task2;
public class Main {
    public static void main(String[] args) {
        System.out.println("==== Brand → Model ====");
        Model m = new Model(1, "Toyota", 101, "Corolla");
        m.printInfo();

        System.out.println("\n==== Address → Person → Developer ====");
        Address a = new Address("Bakı", "Nizami küçəsi 10");
        Developer d = new Developer("Elvin", 25, a, "Backend Developer", 2500);
        d.printInfo();
        d.changeName("Rauf");
        System.out.println("Ad dəyişdirildikdən sonra:");
        d.printInfo();

        System.out.println("\n==== Company → Car ====");
        Car c = new Car(1, "Tesla", 1_000_000, 101, "Tesla", "Model S", 100_000);
        c.printInfo();
        c.calculate();
    }
}
