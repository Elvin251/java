package Lesson36Homework;

interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle2 implements Resizable {
    int width, height;

    Rectangle2(int w, int h) {
        width = w;
        height = h;
    }

    public void resizeWidth(int w) { width = w; }
    public void resizeHeight(int h) { height = h; }

    void display() {
        System.out.println("Rectangle: " + width + " x " + height);
    }
}

 class Main5 {
    public static void main(String[] args) {
        Rectangle2 r = new Rectangle2(10, 20);
        r.display();
        r.resizeWidth(30);
        r.resizeHeight(40);
        r.display();
    }
}
