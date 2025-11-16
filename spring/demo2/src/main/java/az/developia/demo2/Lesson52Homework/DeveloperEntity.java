package az.developia.demo2.Lesson52Homework;

public class DeveloperEntity {
    private Long id;
    private String name;
    private String surname;
    private String job;
    private double salary;
    private int experienceYear;


    public DeveloperEntity() {}


    public DeveloperEntity(Long id, String name, String surname, String job, double salary, int experienceYear) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.job = job;
        this.salary = salary;
        this.experienceYear = experienceYear;
    }


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }


    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }


    public String getJob() { return job; }
    public void setJob(String job) { this.job = job; }


    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }


    public int getExperienceYear() { return experienceYear; }
    public void setExperienceYear(int experienceYear) { this.experienceYear = experienceYear; }
}