package az.developia.demo2.Lesson51Homework.Task1;

public class BookEntity {
    private Long id;
    private String name;
    private double price;
    private String description;
    private int count;

    public BookEntity() {}

    public BookEntity(Long id, String name, double price, String description, int count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.count = count;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getCount() { return count; }
    public void setCount(int count) { this.count = count; }
}