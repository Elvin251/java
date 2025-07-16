package Lesson27Practice.Task1;

public class ModifiersDemo {
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("Elvin");
        Person p3 = new Person("Elvin", 15);
//        Person p4 = new Person("Elvin", 15,"Baku"); bu isdemiyecek cunki privatedir.


        p1.publicMethod();
        p1.protectedMethod();
        p1.defaultMethod();
//        p1.privateMethod(); bu da pravite olduqu ucun isdemiyecek

        p1.saySomethingFinal("Salam!");


        System.out.println("Static info: " + Person.staticInfo);
    }
}
