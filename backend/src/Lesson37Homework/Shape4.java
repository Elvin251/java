package Lesson37Homework;

class Shape4 {
    void draw() { System.out.println("Drawing shape"); }
    double calculateArea() { return 0; }
}

class Circle4 extends Shape4 {
    double radius;
    Circle4(double r) { radius = r; }
    @Override
    void draw() { System.out.println("Drawing Circle"); }
    @Override
    double calculateArea() { return Math.PI * radius * radius; }
}

class Cylinder extends Shape4 {
    double radius, height;
    Cylinder(double r, double h) { radius = r; height = h; }
    @Override
    void draw() { System.out.println("Drawing Cylinder"); }
    @Override
    double calculateArea() { return 2 * Math.PI * radius * (radius + height); }
}

 class Main12 {
    public static void main(String[] args) {
        Shape4 c = new Circle4(5);
        Shape4 cyl = new Cylinder(5, 10);
        c.draw(); System.out.println("Circle Area: " + c.calculateArea());
        cyl.draw(); System.out.println("Cylinder Area: " + cyl.calculateArea());
    }
}

