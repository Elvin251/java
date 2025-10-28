package az.developia.demo2.Lesson47practice;



import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class Calcuatıng {
    public List<Integer> getNumbers() {
        return IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
    }
}
