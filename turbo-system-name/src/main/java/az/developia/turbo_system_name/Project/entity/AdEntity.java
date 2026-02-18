package az.developia.turbo_system_name.Project.entity;

import jakarta.persistence.*;

@Entity
@Table(name="ads")
public class AdEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int year;
    private double price;
    private String city;
    private String imageUrl;

    @Column(length = 2000)
    private String description;

    @ManyToOne
    private BrandEntity brand;

    @ManyToOne
    private ModelEntity model;

    @ManyToOne
    private UserEntity seller;

    public AdEntity(){}

    public Long getId(){ return id; }

    public int getYear(){ return year; }

    public void setYear(int year){ this.year = year; }

    public double getPrice(){ return price; }

    public void setPrice(double price){ this.price = price; }

    public String getCity(){ return city; }

    public void setCity(String city){ this.city = city; }

    public String getImageUrl(){ return imageUrl; }

    public void setImageUrl(String imageUrl){ this.imageUrl = imageUrl; }

    public String getDescription(){ return description; }

    public void setDescription(String description){ this.description = description; }

    public BrandEntity getBrand(){ return brand; }

    public void setBrand(BrandEntity brand){ this.brand = brand; }

    public ModelEntity getModel(){ return model; }

    public void setModel(ModelEntity model){ this.model = model; }

    public UserEntity getSeller(){ return seller; }

    public void setSeller(UserEntity seller){ this.seller = seller; }
}