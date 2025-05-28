package Lesson13Homework;

public class Main {
    public static void main(String[] args) {
        // Tapşırıq 1: Student yoxlanışı
        Student student1 = new Student();
        Student student2 = new Student("Aysel", 21);
        System.out.println("Student1: " + student1.name + ", " + student1.age);
        System.out.println("Student2: " + student2.name + ", " + student2.age);

        // Tapşırıq 2: Rectangle yoxlanışı
        Rectangle rect = new Rectangle(5.0, 3.0);
        System.out.println("Düzbucaqlının sahəsi: " + rect.calculateArea());

        // Tapşırıq 3: Book yoxlanışı
        Book book1 = new Book("Yüz ilin tənhalığı", "Gabriel Garcia Marquez", 12.5);
        Book book2 = new Book("Əli və Nino", "Qurban Səid");
        Book book3 = new Book();
        System.out.println("Book1: " + book1.title + ", " + book1.author + ", " + book1.price);
        System.out.println("Book2: " + book2.title + ", " + book2.author + ", " + book2.price);
        System.out.println("Book3: " + book3.title + ", " + book3.author + ", " + book3.price);

        // Tapşırıq 4: Employee yoxlanışı
        Employee emp = new Employee("Elvin", "Programmer", 2000.0);
        System.out.println("Əvvəlki maaş: " + emp.salary);
        emp.increaseSalary(10);
        System.out.println("Artırılmış maaş (10%): " + emp.salary);

        // Tapşırıq 5: BankAccount yoxlanışı
        BankAccount account1 = new BankAccount("ACC001", "Nigar", 300.0);
        BankAccount account2 = new BankAccount("ACC002", "Murad");

        account1.deposit(50);
        System.out.println("Yeni balans (account1): " + account1.balance);

        account1.withdraw(100);
        System.out.println("Balansdan sonra çıxış (account1): " + account1.balance);

        account2.withdraw(10);

    }
}
