package az.developia.demo2.Lesson55;


public class PhoneEntity {

    private Long id;
    private String brand;
    private String model;
    private String pictureUrl;
    private Double price;
    private String color;
    private Integer ram;
    private Integer memory;

    public PhoneEntity() {}

    public PhoneEntity(Long id, String brand, String model, String pictureUrl,
                       Double price, String color, Integer ram, Integer memory) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.pictureUrl = pictureUrl;
        this.price = price;
        this.color = color;
        this.ram = ram;
        this.memory = memory;
    }

    // GETTER & SETTER-lər

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getPictureUrl() { return pictureUrl; }
    public void setPictureUrl(String pictureUrl) { this.pictureUrl = pictureUrl; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public Integer getRam() { return ram; }
    public void setRam(Integer ram) { this.ram = ram; }

    public Integer getMemory() { return memory; }
    public void setMemory(Integer memory) { this.memory = memory; }
}