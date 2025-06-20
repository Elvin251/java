package Lesson19homework.Derspraktikasi2;

public class ClassAndObjectAndConstructors {
    public static void main(String[] args) {

        Computer computer1 = new Computer();

        Computer computer2 = new Computer("MacBook Pro");

        Computer computer3 = new Computer("Dell XPS", "Black");

        System.out.println();
        System.out.println("Computer 1:");
        System.out.println("ID: " + computer1.id);
        System.out.println("Brand: " + computer1.brand);
        System.out.println("Model: " + computer1.model);
        System.out.println("Color: " + computer1.color);

        System.out.println();
        System.out.println("Computer 2:");
        System.out.println("ID: " + computer2.id);
        System.out.println("Brand: " + computer2.brand);
        System.out.println("Model: " + computer2.model);
        System.out.println("Color: " + computer2.color);

        System.out.println();
        System.out.println("Computer 3:");
        System.out.println("ID: " + computer3.id);
        System.out.println("Brand: " + computer3.brand);
        System.out.println("Model: " + computer3.model);
        System.out.println("Color: " + computer3.color);
    }
}

// Computer sinifi
class Computer {
    Integer id;
    String brand;
    String model;
    String color;

    public Computer() {
        System.out.println("Default constructor çağırıldı.");
        this.id = 1;
        this.brand = "HP";
        this.model = "Pavilion";
        this.color = "Silver";
    }

    public Computer(String model) {
        System.out.println("Model constructor çağırıldı: " + model);
        this.id = 2;
        this.brand = "Apple";
        this.model = model;
        this.color = "Space Gray";
    }

    public Computer(String model, String color) {
        System.out.println("Model və color constructor çağırıldı: " + model + ", " + color);
        this.id = 3;
        this.brand = "Dell";
        this.model = model;
        this.color = color;
    }
}