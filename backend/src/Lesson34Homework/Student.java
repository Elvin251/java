package Lesson34Homework;

import java.util.Arrays;

class Student {
    private int student_id;
    private String student_name;
    private int[] grades;
    private int gradeCount;

    public Student(int student_id, String student_name, int maxGrades) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new int[maxGrades];
        this.gradeCount = 0;
    }


    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }


    public void addGrade(int grade) {
        if (grade < 0 || grade > 100) {
            System.out.println("❌ Yanlış qiymət! 0-100 aralığında olmalıdır.");
            return;
        }
        if (gradeCount < grades.length) {
            grades[gradeCount] = grade;
            gradeCount++;
            System.out.println("✅ Qiymət əlavə olundu: " + grade);
        } else {
            System.out.println("❌ Artıq daha çox qiymət əlavə etmək olmur!");
        }
    }


    public void showGrades() {
        System.out.println(student_name + " qiymətləri: " + Arrays.toString(Arrays.copyOf(grades, gradeCount)));
    }
}


