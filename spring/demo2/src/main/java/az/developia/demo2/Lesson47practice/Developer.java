package az.developia.demo2.Lesson47practice;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Developer {
    private String name;
    private String surname;
    private String job;
    private double salary;
}
