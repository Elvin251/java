package az.developia.demo2.Lesson48Homework.com.example.demo;



import org.springframework.stereotype.Component;

@Component
public class Product {

    private int id;
    private String title;
    private double price;
    private int quantity;

    public Product() {
        this.id = 1001;
        this.title = "Noutbuk";
        this.price = 1500.75;
        this.quantity = 10;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
