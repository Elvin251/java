package az.developia.demo2.Lesson49practice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MyEmployeeController {

    private final List<MyEmployee> employees = Arrays.asList(
            new MyEmployee(1, "Ali", "Huseynov", "Developer", 2500),
            new MyEmployee(2, "Aygun", "Mammadova", "Designer", 1800),
            new MyEmployee(3, "Ramil", "Aliyev", "Manager", 3000)
    );

    @GetMapping("/myInfo")
    public MyEmployee getMyEmployeeInformation() {
        return employees.get(0);
    }

    @GetMapping("/employee/valuable")
    public List<MyEmployee> getTheMostValuableEmployees() {
        return employees.stream()
                .filter(e -> e.getSalary() > 2000)
                .collect(Collectors.toList());
    }

    @GetMapping("/job")
    public String getEmployeeJob() {
        MyEmployee employee = employees.get(0);
        return employee.getJob();
    }
}

