package Lesson21Homework.PdfTapsiriqlari.Tap1;
public class ClassAndObjectHome {

    static class Person {
        int id;
        String name;
        String surname;
        int age;
        String phone;
    }

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.id = 1;
        person1.name = "Rauf";
        person1.surname = "Quliyev";
        person1.age = 25;
        person1.phone = "+994501234567";


        Person person2 = new Person();
        person2.id = 2;
        person2.name = "Aytac";
        person2.surname = "Məmmədova";
        person2.age = 22;
        person2.phone = "+994551112233";

        System.out.println("Person 1 məlumatları:");
        System.out.println("ID: " + person1.id);
        System.out.println("Ad: " + person1.name);
        System.out.println("Soyad: " + person1.surname);
        System.out.println("Yaş: " + person1.age);
        System.out.println("Telefon: " + person1.phone);

        System.out.println();

        System.out.println("Person 2 məlumatları:");
        System.out.println("ID: " + person2.id);
        System.out.println("Ad: " + person2.name);
        System.out.println("Soyad: " + person2.surname);
        System.out.println("Yaş: " + person2.age);
        System.out.println("Telefon: " + person2.phone);
    }
}