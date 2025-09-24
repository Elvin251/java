package Lesson38Homework;
class Rectangle {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() { return width * height; }
    double getPerimeter() { return 2 * (width + height); }
}

class Main3 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 3);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
    }
}
