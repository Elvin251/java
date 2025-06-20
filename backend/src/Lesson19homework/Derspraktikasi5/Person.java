package Lesson19homework.Derspraktikasi5;

public class Person {
    String name;
    String surname;
    int experienceYear;
    double salary;
    String phone;

    public void printInfo() {
        System.out.println("Ad: " + name);
        System.out.println("Soyad: " + surname);
        System.out.println("İş təcrübəsi (il): " + experienceYear);
        System.out.println("Maaş: " + salary + " AZN");
        System.out.println("Telefon: " + phone);
    }
}
