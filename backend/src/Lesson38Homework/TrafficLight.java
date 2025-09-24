package Lesson38Homework;

class TrafficLight {
    String color;
    int duration;

    TrafficLight(String color, int duration) {
        this.color = color; this.duration = duration;
    }

    void changeColor(String newColor) { color = newColor; }
    boolean isRed() { return color.equalsIgnoreCase("red"); }
    boolean isGreen() { return color.equalsIgnoreCase("green"); }
}

class Main8 {
    public static void main(String[] args) {
        TrafficLight t = new TrafficLight("red", 30);
        System.out.println("Is red? " + t.isRed());
        t.changeColor("green");
        System.out.println("Is green? " + t.isGreen());
    }
}
