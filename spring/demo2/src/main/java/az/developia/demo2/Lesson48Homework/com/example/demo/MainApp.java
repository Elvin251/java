package az.developia.demo2.Lesson48Homework.com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MainApp.class, args);

        Student student = context.getBean(Student.class);
        System.out.println("=== Student Məlumatları ===");
        System.out.println("ID: " + student.getId());
        System.out.println("Ad: " + student.getName());
        System.out.println("Soyad: " + student.getSurname());
        System.out.println("Qiymət: " + student.getGrade());

        Product product = context.getBean(Product.class);
        System.out.println("\n=== Product Məlumatları ===");
        System.out.println("ID: " + product.getId());
        System.out.println("Başlıq: " + product.getTitle());
        System.out.println("Qiymət: " + product.getPrice());
        System.out.println("Say: " + product.getQuantity());

        Car car = context.getBean(Car.class);
        System.out.println("\n=== Car Məlumatları ===");
        System.out.println("Marka: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("İl: " + car.getYear());
        System.out.println("Qiymət: " + car.getPrice());
    }
}

