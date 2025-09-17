package Lesson35Homework;
class Animal2 {
    public void move() {
        System.out.println("Animal is moving");
    }
}

class Cheetah extends Animal2 {
    @Override
    public void move() {
        System.out.println("Cheetah runs fast!");
    }
}

 class Main6 {
    public static void main(String[] args) {
        Animal2 c = new Cheetah();
        c.move();
    }
}
