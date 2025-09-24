package Lesson37Homework;

class Shape {
    double calculateArea() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;
    Circle(double r) { radius = r; }
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) { length = l; width = w; }
    @Override
    double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base, height;
    Triangle(double b, double h) { base = b; height = h; }
    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

class Main3 {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);
        Shape t = new Triangle(4, 5);
        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Rectangle Area: " + r.calculateArea());
        System.out.println("Triangle Area: " + t.calculateArea());
    }
}
