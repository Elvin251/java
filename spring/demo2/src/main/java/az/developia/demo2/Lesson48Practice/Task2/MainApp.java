package az.developia.demo2.Lesson48Practice.Task2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("az.developia.demo2.Lesson48Practice.Task2") 
public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(MainApp.class);

        System.out.println("=== Bean siyahısı ===");
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }

        System.out.println("\n=== MyBook bean yoxlaması ===");

        boolean existsByName = context.containsBean("myBook");
        System.out.println("myBook adlı bean varmı? " + existsByName);


        boolean existsByType = !context.getBeansOfType(MyBook.class).isEmpty();
        System.out.println("MyBook sinfinə aid bean varmı? " + existsByType);

        try {
            MyBook myBook = context.getBean(MyBook.class);
            System.out.println("\n✅ MyBook bean tapıldı!");
            myBook.printInfo();
        } catch (Exception e) {
            System.out.println("\n❌ MyBook bean tapılmadı!");
        }
    }
}