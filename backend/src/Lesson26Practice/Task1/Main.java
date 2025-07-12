package Lesson26Practice.Task1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Elvin";
        person.surname = "Məmmədov";
        person.age = 15;
        person.printInfo();

        Developer developer = new Developer();
        developer.setPerson(person);
        developer.setSalary(2500);
        developer.setMajor("Java Backend");

        System.out.println("Developer Salary: " + developer.getSalary());
        System.out.println("Developer Major: " + developer.getMajor());
        developer.getPerson().printInfo();
    }
}
