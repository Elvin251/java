package az.developia.demo2.Lesson50Practice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo2Application {
    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }

    @Bean
    CommandLineRunner runner(UserRepository userRepo, ComputerRepository compRepo) {
        return args -> {

            userRepo.save(new User(null, "user1", "pass1", "user1@gmail.com", Status.ONLINE));
            userRepo.save(new User(null, "user2", "pass2", "user2@mail.com", Status.ONLINE));
            userRepo.save(new User(null, "user3", "pass3", "user3@gmail.com", Status.ONLINE));
            userRepo.save(new User(null, "user4", "pass4", "xuser4@gmail.com", Status.OFFLINE));
            userRepo.save(new User(null, "user5", "pass5", "random@mail.com", Status.OFFLINE));

            compRepo.save(new Computer(null, "HP", "ProBook", "black", 1200.0, 16, 512));
            compRepo.save(new Computer(null, "HP", "EliteBook", "silver", 1500.0, 32, 1024));
            compRepo.save(new Computer(null, "ASUS", "VivoBook", "gray", 1000.0, 16, 512));
            compRepo.save(new Computer(null, "ASUS", "ROG", "red", 1800.0, 32, 1024));
            compRepo.save(new Computer(null, "MAC", "MacBook Pro", "white", 2000.0, 16, 512));
        };
    }
}
