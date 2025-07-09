package Lesson25Practice.Task2;

public class Person {
    private String name;
    private String surname;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    void printInfo() {
        System.out.println("Ad: " + name);
        System.out.println("Soyad: " + surname);
        System.out.println("Yaş: "+age);
    }

}
