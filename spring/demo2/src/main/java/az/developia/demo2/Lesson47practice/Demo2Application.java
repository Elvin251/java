package az.developia.demo2.Lesson47practice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo2Application {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Demo2Application.class, args);

        System.out.println("\n✅ --- Bütün Bean adları ---");
        String[] beanNames = context.getBeanDefinitionNames();
        for (String name : beanNames) {
            System.out.println(name);
        }

        System.out.println("\n✅ --- Component-lərin nəticələri ---");
        Mycomponent comp = context.getBean(Mycomponent.class);
        System.out.println(comp.getMessage());

        Calcuatıng calc = context.getBean(Calcuatıng.class);
        System.out.println("1-10: " + calc.getNumbers());

        OnlyEven even = context.getBean(OnlyEven.class);
        System.out.println("Cüt ədədlər: " + even.getEvenNumbers());
    }
}

