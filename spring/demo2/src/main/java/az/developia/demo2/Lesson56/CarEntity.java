package az.developia.demo2.Lesson56;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cars")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;          // name → brand

    @Column(columnDefinition = "TEXT")
    private String description;

    private String model;          // author → model

    private Double price;

    @Column(name = "car_year")
    private Integer year;

    @Column(name = "km_count")
    private Integer kmCount;       // pageCount → kmCount
}
