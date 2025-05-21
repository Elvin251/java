package Lesson12Practice;

public class Main {
    public static void main(String[] args) {
//        1/Student:
        System.out.println("=== Student Testi ===");
        Student s1 = new Student();
        Student s2 = new Student("Aysel", 20);
        System.out.println(s1);
        System.out.println(s2);
//        2/Rectangle:
        System.out.println("=== Rectangle Testi ===");
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(7.5, 3.2);

        System.out.println(r1);
        r1.calculateArea();

        System.out.println(r2);
        r2.calculateArea();
//        3/Book:
        System.out.println("=== Book Testi ===");
        Book b1 = new Book("Kitab A", "Yazar A", 15.0);
        Book b2 = new Book("Kitab B", "Yazar B");
        Book b3 = new Book();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
//        4/Employee:
        Employe e = new Employe("Rauf", "Developer", 1800);
        System.out.println("Əvvəl: " + e.salary);

// 10% artırmaq üçün:
        e.salary = e.salary + (e.salary * 10 / 100);

        System.out.println("Sonra: " + e.salary);
//        5/BankAccount:
        System.out.println("=== BankAccount Testi ===");
        BankAccount acc1 = new BankAccount("1111", "Nigar", 100);
        BankAccount acc2 = new BankAccount("2222", "Ayan");

        acc1.deposit(50);
        acc1.withdraw(120);
        acc1.withdraw(50);

        System.out.println(acc1);
        System.out.println(acc2);
}
}
