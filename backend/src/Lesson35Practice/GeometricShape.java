package Lesson35Practice;

abstract class GeometricShape {
    abstract double area();
    abstract double perimeter();
}

class Triangle2 extends GeometricShape {
    double a, b, c;
    Triangle2(double a, double b, double c) { this.a = a; this.b = b; this.c = c; }
    double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    double perimeter() { return a + b + c; }
}

class Square extends GeometricShape {
    double side;
    Square(double side) { this.side = side; }
    double area() { return side * side; }
    double perimeter() { return 4 * side; }
}
