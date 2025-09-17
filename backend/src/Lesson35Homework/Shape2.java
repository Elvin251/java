package Lesson35Homework;

class Shape2 {
    public double getPerimeter() {
        return 0.0;
    }

    public double getArea() {
        return 0.0;
    }
}

class Circle extends Shape2 {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

 class Main8 {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        System.out.println("Perimeter: " + c.getPerimeter());
        System.out.println("Area: " + c.getArea());
    }
}
