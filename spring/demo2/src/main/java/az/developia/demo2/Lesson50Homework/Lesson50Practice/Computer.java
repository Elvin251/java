package az.developia.demo2.Lesson50Homework.Lesson50Practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Computer {
    private Long id;
    private String brand;
    private String model;
    private String color;
    private Double price;
    private Integer ram;
    private Integer memory;
}
