package Lesson26Practice.Task3;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Aygün";
        teacher.surname = "Quliyeva";
        teacher.major = "Math";

        Student student = new Student();
        student.name = "Nihat";
        student.surname = "Həsənov";
        student.age = 17;

        ClassRoom classRoom = new ClassRoom();
        classRoom.setTeacher(teacher);
        classRoom.setStudent(student);
        classRoom.setNumber("11A");

        teacher.printInfo();
        student.printInfo();
        System.out.println("Class Number: " + classRoom.getNumber());
    }

}
