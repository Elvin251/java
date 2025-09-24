package Lesson38Homework;

class Chain {
    Chain() { this(10); System.out.println("Default constructor"); }
    Chain(int x) { System.out.println("Param constructor: " + x); }
}

 class Main23 {
    public static void main(String[] args) {
        new Chain();
    }
}
