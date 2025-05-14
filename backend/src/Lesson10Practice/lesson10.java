package Lesson10Practice;

public class lesson10 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Aylin";
        emp.surname = "Mammadova";
        emp.job = "Designer";
        emp.salary = 1800.0;
        System.out.println(emp);

        Book book = new Book();
        book.name = "Clean Code";
        book.author = "Robert C. Martin";
        book.year = 2008;
        book.pageCount = 464;
        System.out.println(book);
    }
}
