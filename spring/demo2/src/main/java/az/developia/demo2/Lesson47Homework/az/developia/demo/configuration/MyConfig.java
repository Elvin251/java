package az.developia.demo2.Lesson47Homework.az.developia.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public UserService userService() {
        return new UserService();
    }

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }

    @Bean
    public UserController userController() {
        return new UserController();
    }
}