package az.developia.demo2.Lesson51Homework.Task2;
public class StudentEntity {
    private Long id;
    private String name;
    private int age;
    private double grade;

    public StudentEntity() {}

    public StudentEntity(Long id, String name, int age, double grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getGrade() { return grade; }
    public void setGrade(double grade) { this.grade = grade; }
}