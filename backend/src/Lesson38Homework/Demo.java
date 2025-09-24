package Lesson38Homework;

class Demo {
    protected void finalize() {
        System.out.println("Object is destroyed");
    }
}

 class Main22 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d = null;
        System.gc(); // çağırır finalize()
    }
}
