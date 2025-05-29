package Lesson14Homework;

public class Student {
    String name;
    String surname;
    int age;
    double scratchGrade;
    double frontGrade;
    double backGrade;

    public Student(String name, String surname, int age, double scratchGrade, double frontGrade, double backGrade) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.scratchGrade = scratchGrade;
        this.frontGrade = frontGrade;
        this.backGrade = backGrade;
    }

    public void getAgeCategory() {
        if (age >= 10 && age <= 14) {
            System.out.println("gənc");
        } else if (age >= 15 && age <= 20) {
            System.out.println("orta");
        } else if (age >= 25) {
            System.out.println("yaşlı");
        } else {
            System.out.println("Uyğun yaş kateqoriyası yoxdur.");
        }
    }

    public void calculateAverageGrade() {
        double avg = (scratchGrade + frontGrade + backGrade) / 3;
        if (avg < 60) {
            System.out.println("zəif");
        } else if (avg <= 80) {
            System.out.println("orta");
        } else if (avg <= 90) {
            System.out.println("yaxşı");
        } else {
            System.out.println("əla");
        }
    }

    public String toString() {
        return "Ad: " + name + "\nSoyad: " + surname + "\nYaş: " + age +
                "\nScratch Qiyməti: " + scratchGrade +
                "\nFrontend Qiyməti: " + frontGrade +
                "\nBackend Qiyməti: " + backGrade;
    }
}
