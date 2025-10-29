package az.developia.demo2.Lesson48Practice.aze.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("az.developia.demo2.Lesson48Practice.aze.example")
public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(MainApp.class);

        Book book = context.getBean(Book.class);

        book.printInfo();
    }
}