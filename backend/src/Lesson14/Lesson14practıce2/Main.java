package Lesson14.Lesson14practıce2;

public class Main {

    public static void main(String[] args) {

        Group group242 = new Group("242-A1");

        Teacher mathTeacher = new Teacher("Ramil", "Huseynov", group242, "Riyaziyyat");
        Teacher englishTeacher = new Teacher("Leyla", "Memmedova", group242, "İngilis dili");
        Teacher historyTeacher = new Teacher("Fidan", "Aliyeva", group242, "Tarix");

        Student student1 = new Student("Elvin", "Mammadov", group242, 80, 65, 55);
        Student student2 = new Student("Aysel", "Quliyeva", group242, 45, 50, 40);

        student1.printInfo();
        System.out.println("-------------------------");
        student2.printInfo();

    }
}
