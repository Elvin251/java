package az.developia.demo.Project;



import jakarta.persistence.*;

@Entity
@Table(name = "brands")
public class BrandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;

    public BrandEntity() {
    }
}