package az.developia.demo.Project;



import jakarta.persistence.*;

@Entity
@Table(name = "models")
public class ModelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    public BrandEntity brand;

    public ModelEntity() {
    }
}