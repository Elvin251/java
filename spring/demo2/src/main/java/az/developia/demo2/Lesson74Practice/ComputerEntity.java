package az.developia.demo2.Lesson74Practice;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "computers")
@Data
public class ComputerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;

    private String model;

    private Double price;

    private String color;
}