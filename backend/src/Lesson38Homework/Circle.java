package Lesson38Homework;

class Circle {
    double radius;

    Circle(double radius) { this.radius = radius; }
    void setRadius(double radius) { this.radius = radius; }

    double getArea() { return Math.PI * radius * radius; }
    double getCircumference() { return 2 * Math.PI * radius; }
}

class Main4 {
    public static void main(String[] args) {
        Circle c = new Circle(4);
        System.out.println("Area: " + c.getArea());
        System.out.println("Circumference: " + c.getCircumference());
    }
}
