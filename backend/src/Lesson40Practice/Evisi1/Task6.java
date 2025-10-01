package Lesson40Practice.Evisi1;

class Parent {
    void show() throws Exception {
        System.out.println("Parent metodu");
        throw new Exception("Parent exception");
    }
}

class Child extends Parent {
    @Override
    void show() throws ArithmeticException { // daha dar (unchecked) exception
        System.out.println("Child metodu");
        throw new ArithmeticException("Child exception");
    }
}

 class SimpleOverriding {
    public static void main(String[] args) {
        Parent obj = new Child();
        try {
            obj.show();
        } catch (Exception e) {
            System.out.println("Xeta handle edildi: " + e.getMessage());
        }
    }
}

