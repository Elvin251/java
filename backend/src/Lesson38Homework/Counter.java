package Lesson38Homework;

class Counter {
    static int count = 0;
    Counter() { count++; }
    static void printCount() {
        System.out.println("Objects created: " + count);
    }
}

class Main18 {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        Counter.printCount();
    }
}
