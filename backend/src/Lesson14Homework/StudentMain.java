package Lesson14Homework;

public class StudentMain {
    public static void main(String[] args) {
        Student st = new Student("Ali", "Hüseynov", 18, 75, 85, 90);
        System.out.println(st);
        st.getAgeCategory();
        st.calculateAverageGrade();
    }
}
