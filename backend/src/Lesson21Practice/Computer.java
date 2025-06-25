package Lesson21Practice;

public class Computer {
    String model;
    String color;

    public Computer() {
        this.model = "Unknown";
        this.color = "Unknown";
    }

    public Computer(String model) {
        this.model = model;
        this.color = "Unknown";
    }

    public Computer(String model, String color) {
        this.model = model;
        this.color = color;
    }
}
