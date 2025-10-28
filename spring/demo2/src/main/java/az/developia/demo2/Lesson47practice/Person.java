package az.developia.demo2.Lesson47practice;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Person {
    private String name;
    private String surname;
    private int age;
    private double salary;
}
