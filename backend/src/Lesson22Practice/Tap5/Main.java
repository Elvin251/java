package Lesson22Practice.Tap5;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Aysel", 90, 85, 88, "BDU"),
                new Student("Elvin", 80, 70, 75, "ADNSU"),
                new Student("Nigar", 95, 91, 92, "BDU"),
                new Student("Rauf", 78, 82, 80, "UNEC"),
                new Student("Tural", 95, 91, 92, "BDU")
        };

        double maxAvg = students[0].average();
        for (Student s : students) {
            if (s.average() > maxAvg) {
                maxAvg = s.average();
            }
        }

        System.out.println("Ən yüksək ortalamalı tələbə(lər):");
        for (Student s : students) {
            if (s.average() == maxAvg) {
                System.out.println(s);
            }
        }
    }
}

