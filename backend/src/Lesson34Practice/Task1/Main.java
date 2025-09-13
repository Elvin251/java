package Lesson34Practice.Task1;

import Lesson34Practice.ElectricCar;
import Lesson34Practice.Group;
import Lesson34Practice.Square;
import Lesson34Practice.Task1.Food;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== Person → Teacher → Student → Group ====");
        Group g = new Group("Elvin", "Həsənov", 20, "Computer Science", "CS-101", "Room 5");
        g.printInfo();

        System.out.println("\n==== Company → Food ====");
        Food f = new Food("KFC", "Burger", "Toyuq ilə hazırlanmış burger", 7.5);
        f.printInfo();

        System.out.println("\n==== Vehicle → Car → ElectricCar ====");
        ElectricCar ec = new ElectricCar("Tesla", 250, "Electric", 100);
        ec.printInfo();

        System.out.println("\n==== Shape → Rectangle → Square ====");
        Square sq = new Square(5);
        sq.printInfo();
    }
}
