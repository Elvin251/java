package az.developia.demo2.Lesson47practice;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Book {
    private String name;
    private String description;
    private double price;
    private String author;

    public String getNameAndPrice() {
        return name + " - " + price + "₼";
    }
}
