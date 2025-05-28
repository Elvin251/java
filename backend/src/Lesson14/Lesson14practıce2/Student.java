package Lesson14.Lesson14practıce2;

public class Student {
    String name;
    String surname;
    Group group;
    int mathScore;
    int englishScore;
    int historyScore;

    public Student(String name, String surname, Group group, int mathScore, int englishScore, int historyScore) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.historyScore = historyScore;
    }

    public double average() {
        return (mathScore + englishScore + historyScore) / 3.0;
    }

    public String scholarshipStatus() {
        double avg = average();
        if (avg < 51) {
            return "Kəsildi";
        } else if (avg <= 70) {
            return "100 manat";
        } else if (avg <= 90) {
            return "150 manat";
        } else {
            return "175 manat";
        }
    }

    public void printInfo() {
        System.out.println("Tələbə: " + name + " " + surname);
        System.out.println("Qrup: " + group.name);
        System.out.println("Ortalama bal: " + average());
        System.out.println("Stipendiya: " + scholarshipStatus());
    }
}
