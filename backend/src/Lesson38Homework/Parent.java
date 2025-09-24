package Lesson38Homework;

class Parent {
    void greet() { System.out.println("Hello from Parent"); }
}

class Child extends Parent {
    void greet() { System.out.println("Hello from Child"); }
}

 class Main19 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        p.greet();
        c.greet();
    }
}
