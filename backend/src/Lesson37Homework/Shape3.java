package Lesson37Homework;
class Shape3 {
    void draw() { System.out.println("Drawing shape"); }
    double calculateArea() { return 0; }
}

class Circle3 extends Shape3 {
    double radius;
    Circle3(double r) { radius = r; }
    @Override
    void draw() { System.out.println("Drawing Circle"); }
    @Override
    double calculateArea() { return Math.PI * radius * radius; }
}

class Square extends Shape3 {
    double side;
    Square(double s) { side = s; }
    @Override
    void draw() { System.out.println("Drawing Square"); }
    @Override
    double calculateArea() { return side * side; }
}

class Triangle3 extends Shape3 {
    double base, height;
    Triangle3(double b, double h) { base = b; height = h; }
    @Override
    void draw() { System.out.println("Drawing Triangle"); }
    @Override
    double calculateArea() { return 0.5 * base * height; }
}

 class Main8 {
    public static void main(String[] args) {
        Shape3 c = new Circle3(5);
        Shape3 s = new Square(4);
        Shape3 t = new Triangle3(4, 5);
        c.draw();
        System.out.println("Circle Area: " + c.calculateArea());
        s.draw();
        System.out.println("Square Area: " + s.calculateArea());
        t.draw();
        System.out.println("Triangle Area: " + t.calculateArea());
    }
}
