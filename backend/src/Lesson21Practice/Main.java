package Lesson21Practice;

public class Main {
    public static void main(String[] args) {
        // Task 1
        Book book1 = new Book();
        book1.title = "1984";
        book1.author = "George Orwell";
        book1.pageCount = 328;

        Book book2 = new Book();
        book2.title = "Brave New World";
        book2.author = "Aldous Huxley";
        book2.pageCount = 311;

        System.out.println(book1.title + ", " + book1.author + ", " + book1.pageCount);
        System.out.println(book2.title + ", " + book2.author + ", " + book2.pageCount);

        // Task 2
        Person person = new Person();
        person.name = "Elvin";
        person.age = 25;
        person.printInfo();

        // Task 3 & 6
        Printer printer = new Printer();
        printer.printName("Ali");
        printer.printName("Veli");
        printer.printName("Zehra");
        printer.printRepeated("Hello", 3);

        // Task 4
        Computer c1 = new Computer();
        Computer c2 = new Computer("HP");
        Computer c3 = new Computer("Dell", "Black");
        System.out.println(c1.model + ", " + c1.color);
        System.out.println(c2.model + ", " + c2.color);
        System.out.println(c3.model + ", " + c3.color);

        // Task 5
        Calculator calc = new Calculator();
        int result = calc.sum(7, 5);
        System.out.println("Sum: " + result);

        // Task 7
        Circle circle = new Circle();
        circle.radius = 5.0;
        calc.calculateLength(circle);
        System.out.println("Circle length: " + circle.length);

        // Task 8
        Employee emp = new Employee();
        emp.name = "Sara";
        emp.salary = 1000;
        SalaryUpdater updater = new SalaryUpdater();
        updater.updateSalary(emp);
        System.out.println(emp.name + "'s updated salary: " + emp.salary);

        // Task 9
        MathUtils mu = new MathUtils();
        System.out.println("2*3 = " + mu.multiply(2, 3));
        System.out.println("2*3*4 = " + mu.multiply(2, 3, 4));

        // Task 10
        Statistics stat = new Statistics();
        System.out.println("Greater: " + stat.compareIntegers(10, 20));
    }
}
