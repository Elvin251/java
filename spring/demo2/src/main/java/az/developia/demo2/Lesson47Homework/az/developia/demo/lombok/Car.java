package az.developia.demo2.Lesson47Homework.az.developia.demo.lombok;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;
}
