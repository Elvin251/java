package az.developia.demo2.Lesson51Homework.Task1;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "*")
public class BookRestController {

    private List<BookEntity> books = new ArrayList<>(List.of(
            new BookEntity(1L, "Java Programming", 45.0, "Beginner to advanced guide", 10),
            new BookEntity(2L, "Spring Boot Mastery", 60.0, "Comprehensive Spring Boot reference", 5),
            new BookEntity(3L, "Clean Code", 50.0, "Writing clean, maintainable code", 8)
    ));

    @GetMapping
    public List<BookEntity> getAllBooks() {
        return books;
    }

    @GetMapping("/most-expensive")
    public BookEntity getMostExpensiveBook() {
        return books.stream()
                .max(Comparator.comparingDouble(BookEntity::getPrice))
                .orElse(null);
    }

    @GetMapping("/search")
    public List<BookEntity> searchByNameAndPrice(@RequestParam String name, @RequestParam double price) {
        return books.stream()
                .filter(b -> b.getName().toLowerCase().contains(name.toLowerCase()) && b.getPrice() == price)
                .toList();
    }
}