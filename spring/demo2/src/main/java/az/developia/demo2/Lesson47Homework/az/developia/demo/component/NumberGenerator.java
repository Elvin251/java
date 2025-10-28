package az.developia.demo2.Lesson47Homework.az.developia.demo.component;


import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class NumberGenerator {
    public List<Integer> getNumbers() {
        return IntStream.rangeClosed(1, 5)
                .boxed()
                .collect(Collectors.toList());
    }
}