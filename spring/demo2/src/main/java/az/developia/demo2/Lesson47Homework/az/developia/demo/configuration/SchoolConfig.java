package az.developia.demo2.Lesson47Homework.az.developia.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchoolConfig {

    @Bean
    public Course course() {
        return new Course();
    }

    @Bean
    public Teacher teacher() {
        return new Teacher();
    }

    @Bean
    public Student student() {
        return new Student();
    }
}