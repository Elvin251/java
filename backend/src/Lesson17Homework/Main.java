package Lesson17Homework;
public class Main {
        public static void main(String[] args) {
            System.out.println("1) Cəm: " +Sum.sum(5, 7));
            System.out.println("2) Böyük ədəd: " + Max.max(10, 20));
            System.out.println("3) Ədədin vəziyyəti: " + CheackNumber.checkNumber(-3));
            System.out.println("4) Faktorial: " + Factorial.factorial(5));

            Student st = new Student("Elvin", "Məmmədov", 80, 90, 70);
            System.out.println("5) Student Məlumatı:" + st);

            System.out.println("6) Vergi: " +CalculateTax.calculateTax(4500));
        }

}