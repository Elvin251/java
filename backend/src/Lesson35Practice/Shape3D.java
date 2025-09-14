package Lesson35Practice;

abstract class Shape3D {
    abstract double calculateVolume();
    abstract double calculateSurfaceArea();
}

class Sphere extends Shape3D {
    double radius;
    Sphere(double radius) { this.radius = radius; }
    double calculateVolume() { return (4/3.0) * Math.PI * Math.pow(radius, 3); }
    double calculateSurfaceArea() { return 4 * Math.PI * radius * radius; }
}

class Cube extends Shape3D {
    double side;
    Cube(double side) { this.side = side; }
    double calculateVolume() { return Math.pow(side, 3); }
    double calculateSurfaceArea() { return 6 * side * side; }
}
