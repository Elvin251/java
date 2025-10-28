package az.developia.demo2.Lesson47practice;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public Myservice myService() {
        return new Myservice();
    }

    @Bean
    public MyClass myClass() {
        return new MyClass();
    }

    @Bean
    public MyObject myObject() {
        return new MyObject();
    }
}
