package az.developia.demo2.Lesson47Homework.az.developia.demo.component;



import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class OddNumbers {
    public List<Integer> getOddNumbers() {
        return IntStream.rangeClosed(1, 10)
                .filter(i -> i % 2 != 0)
                .boxed()
                .collect(Collectors.toList());
    }
}
