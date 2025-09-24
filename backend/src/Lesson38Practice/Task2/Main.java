package Lesson38Practice.Task2;

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee(
                1, "Elsen", "Memmedov", 22,
                "+994501234567", "Baku, Azerbaijan",
                2500.50, "IT Department", "elsenm", "12345"
        );


        emp.printInfo();
    }
}