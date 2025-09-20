package Lesson36Homework;

interface Drawable {
    void draw();
}

class Circle2 implements Drawable {
    public void draw() { System.out.println("Drawing a circle"); }
}

class Rectangle3 implements Drawable {
    public void draw() { System.out.println("Drawing a rectangle"); }
}

class Triangle2 implements Drawable {
    public void draw() { System.out.println("Drawing a triangle"); }
}

 class Main6 {
    public static void main(String[] args) {
        Drawable[] shapes = { new Circle2(), new Rectangle3(), new Triangle2() };
        for (Drawable d : shapes) d.draw();
    }
}
