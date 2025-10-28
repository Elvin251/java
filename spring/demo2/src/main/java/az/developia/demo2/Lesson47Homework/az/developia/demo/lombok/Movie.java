package az.developia.demo2.Lesson47Homework.az.developia.demo.lombok;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Movie {
    private String title;
    private String genre;
    private int duration;
    private double rating;

    public String getTitleAndRating() {
        return title + " - Rating: " + rating;
    }
}
