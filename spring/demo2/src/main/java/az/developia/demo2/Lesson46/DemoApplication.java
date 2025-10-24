package az.developia.demo2.Lesson46;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        System.out.println("\n📜 Bean siyahısı:");
        String[] beans = context.getBeanDefinitionNames();
        for (String bean : beans) {
            if (bean.contains("person") || bean.contains("user") || bean.contains("account")
                    || bean.contains("developer") || bean.contains("student") || bean.contains("teacher")) {
                System.out.println("➡ " + bean);
            }
        }
    }
}