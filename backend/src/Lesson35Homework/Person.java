package Lesson35Homework;

class Person {
    private String firstName;
    private String lastName;

    public Person(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee2 extends Person {
    private String jobTitle;
    private String employeeId;

    public Employee2(String f, String l, String id, String job) {
        super(f, l);
        this.employeeId = id;
        this.jobTitle = job;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }

    public String getEmployeeId() {
        return employeeId;
    }
}

 class Main7 {
    public static void main(String[] args) {
        Employee2 e = new Employee2("Ali", "Huseynov", "E123", "Developer");
        System.out.println(e.getFirstName() + " " + e.getLastName());
        System.out.println("Employee ID: " + e.getEmployeeId());
    }
}

