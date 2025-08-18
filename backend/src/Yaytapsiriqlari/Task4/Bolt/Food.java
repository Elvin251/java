package Yaytapsiriqlari.Task4.Bolt;

public class Food {
    private String name;
    private String description;
    private double price;

    public Food(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Food{name='" + name + "', description='" + description + "', price=" + price + "}";
    }
}
