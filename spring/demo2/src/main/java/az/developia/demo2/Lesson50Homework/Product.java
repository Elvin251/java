package az.developia.demo2.Lesson50Homework;


public class Product {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private ProductType productType;

    public Product() {}

    public Product(Long id, String name, String description, Double price, ProductType productType) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.productType = productType;
    }

    // Getters və Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public ProductType getProductType() { return productType; }
    public void setProductType(ProductType productType) { this.productType = productType; }
}
