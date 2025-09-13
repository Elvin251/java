package Lesson34Practice.Task1;

class Shape {
    double getArea() {
        return 0;
    }

    void printInfo() {
        System.out.println("Sahə: " + getArea());
    }
}

class Rectangle extends Shape {
    double width;
    double length;

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    double getArea() {
        return width * length;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("En: " + width + ", Uzunluq: " + length);
    }
}

class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Tərəf: " + width);
    }
}
