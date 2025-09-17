package Lesson35Homework;

class Shape {
    public double getArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

 class Main3 {
    public static void main(String[] args) {
        Shape r = new Rectangle(5, 10);
        System.out.println("Area: " + r.getArea());
    }
}
