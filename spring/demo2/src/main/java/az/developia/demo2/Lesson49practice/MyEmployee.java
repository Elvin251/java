package az.developia.demo2.Lesson49practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyEmployee {
    private int id;
    private String name;
    private String surname;
    private String job;
    private double salary;
}
