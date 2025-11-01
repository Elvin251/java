package az.developia.demo2.Lesson49practice;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyBook {
    private String bookName;
    private String description;
    private String author;
    private double price;
}
