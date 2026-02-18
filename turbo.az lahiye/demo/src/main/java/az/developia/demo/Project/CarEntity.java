package az.developia.demo.Project;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String color;
    public int year;
    public double price;

    @ManyToOne
    public BrandEntity brand;

    @ManyToOne
    public ModelEntity model;

    public CarEntity() {
    }
}