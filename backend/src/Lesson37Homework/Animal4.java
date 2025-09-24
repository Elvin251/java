package Lesson37Homework;

class Animal4 {
    void eat() { System.out.println("Animal eats"); }
    void sound() { System.out.println("Animal sound"); }
}

class Lion extends Animal4 {
    @Override
    void eat() { System.out.println("Lion eats meat"); }
    @Override
    void sound() { System.out.println("Lion roars"); }
}

class Tiger extends Animal4 {
    @Override
    void eat() { System.out.println("Tiger eats meat"); }
    @Override
    void sound() { System.out.println("Tiger growls"); }
}

class Panther extends Animal4 {
    @Override
    void eat() { System.out.println("Panther eats meat"); }
    @Override
    void sound() { System.out.println("Panther roars softly"); }
}

 class Main10 {
    public static void main(String[] args) {
        Animal4 l = new Lion();
        Animal4 t = new Tiger();
        Animal4 p = new Panther();
        l.eat(); l.sound();
        t.eat(); t.sound();
        p.eat(); p.sound();
    }
}
