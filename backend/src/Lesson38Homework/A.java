package Lesson38Homework;

class A {
    A() { System.out.println("A Constructor"); }
}

class B extends A {
    B() {
        super();
        System.out.println("B Constructor");
    }
}

 class Main21 {
    public static void main(String[] args) {
        B obj = new B();
    }
}

