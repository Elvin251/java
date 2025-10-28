package az.developia.demo2.Lesson47practice;



import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class OnlyEven {
    public List<Integer> getEvenNumbers() {
        return IntStream.rangeClosed(1, 10)
                .filter(n -> n % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
    }
}
