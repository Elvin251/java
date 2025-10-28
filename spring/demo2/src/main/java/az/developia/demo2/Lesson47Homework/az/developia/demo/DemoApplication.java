package az.developia.demo2.Lesson47Homework.az.developia.demo;

import az.developia.demo2.Lesson47Homework.az.developia.demo.component.MeseagePrinter;
import az.developia.demo2.Lesson47Homework.az.developia.demo.component.NumberGenerator;
import az.developia.demo2.Lesson47Homework.az.developia.demo.component.OddNumbers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "az.developia.demo2.Lesson47Homework.az.developia.demo")
public class DemoApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        MeseagePrinter printer = context.getBean(MeseagePrinter.class);
        NumberGenerator generator = context.getBean(NumberGenerator.class);
        OddNumbers oddNumbers = context.getBean(OddNumbers.class);

        System.out.println(printer.printHello());
        System.out.println("Numbers: " + generator.getNumbers());
        System.out.println("Odd Numbers: " + oddNumbers.getOddNumbers());

        System.out.println("\n--- All Bean Names ---");
        for (String name : context.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }
}
