package az.developia.demo2.Lesson49practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MyBookController {

    @GetMapping("/myBook")
    public MyBook getMyBook() {
        return new MyBook("Clean Code", "Programming best practices", "Robert C. Martin", 45.50);
    }

    @GetMapping("/books")
    public List<MyBook> getAllBooks() {
        return Arrays.asList(
                new MyBook("Clean Code", "Programming best practices", "Robert C. Martin", 45.50),
                new MyBook("Effective Java", "Advanced Java techniques", "Joshua Bloch", 50.00),
                new MyBook("Spring in Action", "Spring framework guide", "Craig Walls", 55.00)
        );
    }
    @GetMapping("/description")
    public String getBookDescription() {
        MyBook book = new MyBook("Clean Code", "Programming best practices", "Robert C. Martin", 45.50);
        return book.getDescription();
    }
}
