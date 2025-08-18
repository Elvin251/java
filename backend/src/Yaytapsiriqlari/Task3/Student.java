package Yaytapsiriqlari.Task3;
public class Student {
    private String name;
    private String surname;
    private int age;
    private double scratchGrade;
    private double frontGrade;
    private double backGrade;

    public Student(String name, String surname, int age, double scratchGrade, double frontGrade, double backGrade) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.scratchGrade = scratchGrade;
        this.frontGrade = frontGrade;
        this.backGrade = backGrade;
    }

    public String getAgeCategory() {
        if (age >= 10 && age <= 14) return "Gənc";
        else if (age >= 15 && age <= 20) return "Orta";
        else if (age >= 25) return "Yaşlı";
        else return "Kateqoriya yoxdur";
    }

    public String calculateAverageGrade() {
        double avg = (scratchGrade + frontGrade + backGrade) / 3;
        if (avg < 60) return "Zəif";
        else if (avg <= 80) return "Orta";
        else if (avg <= 90) return "Yaxşı";
        else return "Əla";
    }

    @Override
    public String toString() {
        return "Student{" +
                "ad='" + name + '\'' +
                ", soyad='" + surname + '\'' +
                ", yaş=" + age +
                ", Scratch=" + scratchGrade +
                ", Front=" + frontGrade +
                ", Back=" + backGrade +
                ", Yaş kateqoriyası=" + getAgeCategory() +
                ", Qiymət ortalaması=" + calculateAverageGrade() +
                '}';
    }
}
