package Lesson22Homework;
public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

 class EmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Elvin", 1200),
                new Employee("Aysel", 1500),
                new Employee("Murad", 1400)
        };

        Employee max = employees[0];
        for (Employee e : employees) {
            if (e.salary > max.salary) max = e;
        }

        System.out.println("Ən yüksək maaş alan: " + max.name + " - " + max.salary);
    }
}
