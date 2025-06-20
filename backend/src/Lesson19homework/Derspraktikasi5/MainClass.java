package Lesson19homework.Derspraktikasi5;

public class MainClass {
    public static void main(String[] args) {


        Person person = new Person();
        person.name = "Elvin";
        person.surname = "Hüseynov";
        person.experienceYear = 4;
        person.phone = "+994501234567";

        SalaryCalculator calculator = new SalaryCalculator();
        calculator.calculateSalary(person);


        person.printInfo();
    }
}
