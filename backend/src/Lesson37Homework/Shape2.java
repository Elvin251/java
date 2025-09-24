package Lesson37Homework;

class Shape2 {
    double getArea() { return 0; }
    double getPerimeter() { return 0; }
}

class Circle2 extends Shape2 {
    double radius;
    Circle2(double r) { radius = r; }
    @Override
    double getArea() { return Math.PI * radius * radius; }
    @Override
    double getPerimeter() { return 2 * Math.PI * radius; }
}

class Rectangle2 extends Shape2 {
    double length, width;
    Rectangle2(double l, double w) { length = l; width = w; }
    @Override
    double getArea() { return length * width; }
    @Override
    double getPerimeter() { return 2 * (length + width); }
}

class Triangle2 extends Shape2 {
    double a, b, c;
    Triangle2(double a, double b, double c) { this.a = a; this.b = b; this.c = c; }
    @Override
    double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    @Override
    double getPerimeter() { return a + b + c; }
}

 class Main6 {
    public static void main(String[] args) {
        Shape2 c = new Circle2(5);
        Shape2 r = new Rectangle2(4, 6);
        Shape2 t = new Triangle2(3, 4, 5);
        System.out.println("Circle Area: " + c.getArea() + ", Perimeter: " + c.getPerimeter());
        System.out.println("Rectangle Area: " + r.getArea() + ", Perimeter: " + r.getPerimeter());
        System.out.println("Triangle Area: " + t.getArea() + ", Perimeter: " + t.getPerimeter());
    }
}
