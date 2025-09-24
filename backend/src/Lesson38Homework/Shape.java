package Lesson38Homework;

abstract class Shape {
    String color;
    Shape(String color) { this.color = color; }
    abstract double getArea();
    void printColor() { System.out.println("Color: " + color); }
}

class Circle2 extends Shape {
    double r;
    Circle2(String color, double r) { super(color); this.r = r; }
    double getArea() { return Math.PI * r * r; }
}

class Rectangle2 extends Shape {
    double w,h;
    Rectangle2(String color,double w,double h) { super(color); this.w=w; this.h=h; }
    double getArea() { return w*h; }
}

 class Main13 {
    public static void main(String[] args) {
        Shape s1 = new Circle2("Red", 5);
        Shape s2 = new Rectangle2("Blue", 4, 6);
        s1.printColor();
        System.out.println("Area: " + s1.getArea());
        s2.printColor();
        System.out.println("Area: " + s2.getArea());
    }
}
