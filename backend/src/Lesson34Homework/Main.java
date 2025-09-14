
package Lesson34Homework;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        // ===== 1. Person =====
        Person person = new Person();
        person.setName("Elvin");
        person.setAge(25);
        person.setCountry("Azerbaijan");
        System.out.println("Person: " + person.getName() + ", Age: " + person.getAge() + ", Country: " + person.getCountry());

        // ===== 2. BankAccount =====
        BankAccount account = new BankAccount();
        account.setAccountNumber("123456789");
        account.setBalance(1000);
        System.out.println("BankAccount: " + account.getAccountNumber() + ", Balance: " + account.getBalance());

        // ===== 3. Rectangle =====
        Rectangle rect = new Rectangle();
        rect.setLength(10);
        rect.setWidth(5);
        System.out.println("Rectangle: Length=" + rect.getLength() + ", Width=" + rect.getWidth());

        // ===== 4. Employee =====
        Employee emp = new Employee();
        emp.setEmployee_id(101);
        emp.setEmployee_name("Aysel");
        System.out.println("Employee ID: " + emp.getEmployee_id() + ", Name: " + emp.getEmployee_name() + ", " + emp.getEmployee_salary());

        // ===== 5. Circle =====
        Circle circle = new Circle();
        circle.setRadius(7);
        System.out.println("Circle Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());

        // ===== 6. Car =====
        Car car = new Car();
        car.setCompany_name("Toyota");
        car.setModel_name("Corolla");
        car.setYear(2020);
        System.out.println("Car: " + car.getCompany_name() + " " + car.getModel_name() + ", Year: " + car.getYear() + ", Mileage: " + car.getMileage());

        // ===== 7. Student (array variant) =====
        Student student = new Student(1, "Rauf", 5);
        student.addGrade(90);
        student.addGrade(85);
        student.addGrade(105); // invalid
        student.showGrades();

        // ===== 8. Book =====
        Book book = new Book();
        book.setTitle("Java Programming");
        book.setAuthor("John Doe");
        book.setPrice(50);
        book.applyDiscount(10); // 10% discount
        System.out.println("Book: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Price: " + book.getPrice());

        // ===== 9. Smartphone =====
        Smartphone phone = new Smartphone();
        phone.setBrand("Samsung");
        phone.setModel("Galaxy S21");
        phone.setStorageCapacity(128);
        phone.increaseStorage(64);
        System.out.println("Smartphone: " + phone.getBrand() + " " + phone.getModel() + ", Storage: " + phone.getStorageCapacity() + "GB");

        // ===== 10. Desktop =====
        Desktop desktop = new Desktop();
        desktop.setBrand("Dell");
        desktop.setProcessor("Intel i7");
        desktop.setRamSize(16);
        desktop.upgradeRam(16);
        System.out.println("Desktop: " + desktop.getBrand() + ", Processor: " + desktop.getProcessor() + ", RAM: " + desktop.getRamSize() + "GB");

        // ===== 11. House =====
        House house = new House();
        house.setAddress("Baku, Nizami St.");
        house.setNumberOfRooms(4);
        house.setArea(120);
        System.out.println("House: " + house.getAddress() + ", Rooms: " + house.getNumberOfRooms() + ", Area: " + house.getArea() + " sqm, Price: $" + house.calculatePrice(1000));

        // ===== 12. Account =====
        Account acc = new Account();
        acc.setAccountNumber("987654321");
        acc.setAccountHolder("Aysel");
        acc.setBalance(500);
        acc.deposit(200);
        acc.withdraw(100);
        System.out.println("Account: " + acc.getAccountNumber() + ", Holder: " + acc.getAccountHolder() + ", Balance: " + acc.getBalance());

        // ===== 13. Movie =====
        Movie movie = new Movie();
        movie.setTitle("Inception");
        movie.setDirector("Christopher Nolan");
        movie.setDuration(148);
        System.out.println(movie.getMovieDetails());

      // ==== 14. Product ====
        Product product = new Product();
        product.setProductName("Laptop");
        product.setProductCode("LD");
        product.setPrice(1200.75);
        product.applyDiscount(8);
        System.out.println("Product Name: " + product.getProductName());
        System.out.println("Product Code: " + product.getProductCode());
        System.out.println("Price after discount: $" + product.getPrice());
    }
}
