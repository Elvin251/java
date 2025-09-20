package Lesson36Homework;

interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    double width, height;

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    public double getArea() {
        return width * height;
    }
}

class Circle implements Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle implements Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}

 class Main1 {
    public static void main(String[] args) {
        Shape r = new Rectangle(5, 10);
        Shape c = new Circle(7);
        Shape t = new Triangle(4, 6);

        System.out.println("Rectangle area: " + r.getArea());
        System.out.println("Circle area: " + c.getArea());
        System.out.println("Triangle area: " + t.getArea());
    }
}

