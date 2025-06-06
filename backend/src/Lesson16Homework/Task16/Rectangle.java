package Lesson16Homework.Task16;

public class Rectangle {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double calculateArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 3);
        System.out.println("Sahə: " + rect.calculateArea());
    }
}
