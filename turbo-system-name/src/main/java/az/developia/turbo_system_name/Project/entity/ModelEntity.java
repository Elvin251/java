package az.developia.turbo_system_name.Project.entity;

import jakarta.persistence.*;

@Entity
@Table(name="models")
public class ModelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private BrandEntity brand;

    public ModelEntity(){}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BrandEntity getBrand() {
        return brand;
    }

    public void setBrand(BrandEntity brand) {
        this.brand = brand;
    }
}