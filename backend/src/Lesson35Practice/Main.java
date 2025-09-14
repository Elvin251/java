package Lesson35Practice;

public class Main {
    public static void main(String[] args) {
        // 1) Animal
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        lion.sound(); tiger.sound();

        // 2) Shape
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(3, 4, 5);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());

        // 3) BankAccount
        BankAccount sa = new SavingsAccount(500);
        sa.deposit(200); sa.withdraw(100);
        BankAccount ca = new CurrentAccount(300);
        ca.withdraw(600);

        // 4) Animal2
        new Deer2().eat(); new Lion2().sleep();

        // 5) Employee
        Employee m = new Manager("Alice", 2000, 500);
        Employee p = new Programmer("Bob", 1500, 20, 15);
        m.displayInfo(); p.displayInfo();

        // 6) Shape3D
        Shape3D sphere = new Sphere(3);
        Shape3D cube = new Cube(4);
        System.out.println("Sphere volume: " + sphere.calculateVolume());
        System.out.println("Cube surface: " + cube.calculateSurfaceArea());

        // 7) Vehicle
        Vehicle car = new Car(); car.startEngine();
        Vehicle moto = new Motorcycle(); moto.stopEngine();

        // 8) Person
        new Athlete().exercise(); new LazyPerson().eat();

        // 9) Instrument
        new Glockenspiel().play(); new Violin().tune();

        // 10) Shape2D
        Shape2D r = new Rectangle(4, 6);
        Shape2D c = new Circle2(3);
        r.draw(); r.resize(2); c.draw();

        // 11) Bird
        new Eagle().fly(); new Hawk().makeSound();

        // 12) GeometricShape
        GeometricShape t = new Triangle2(3, 4, 5);
        GeometricShape s = new Square(4);
        System.out.println("Triangle area: " + t.area());
        System.out.println("Square perimeter: " + s.perimeter());
    }
}
