package Lesson35Practice;

abstract class Shape2D {
    abstract void draw();
    abstract void resize(double factor);
}

class Rectangle extends Shape2D {
    double width, height;
    Rectangle(double width, double height) { this.width = width; this.height = height; }
    void draw() { System.out.println("Drawing rectangle " + width + "x" + height); }
    void resize(double factor) {
        width *= factor; height *= factor;
        System.out.println("Resized rectangle " + width + "x" + height);
    }
}

class Circle2 extends Shape2D {
    double radius;
    Circle2(double radius) { this.radius = radius; }
    void draw() { System.out.println("Drawing circle radius " + radius); }
    void resize(double factor) {
        radius *= factor;
        System.out.println("Resized circle radius " + radius);
    }
}
