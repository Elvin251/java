package Lesson34Practice.Task1;

class Person {
    String name;
    String surname;
    int age;

    Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    void printInfo() {
        System.out.println("Ad: " + name + ", Soyad: " + surname + ", Yaş: " + age);
    }
}

class Teacher extends Person {
    String major;

    Teacher(String name, String surname, int age, String major) {
        super(name, surname, age);
        this.major = major;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("İxtisas: " + major);
    }
}

class Student extends Teacher {
    Student(String name, String surname, int age, String major) {
        super(name, surname, age, major);
    }

    @Override
    void printInfo() {
        super.printInfo();
    }
}

class Group extends Student {
    String groupName;
    String room;

    Group(String name, String surname, int age, String major, String groupName, String room) {
        super(name, surname, age, major);
        this.groupName = groupName;
        this.room = room;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Qrup: " + groupName + ", Otaq: " + room);
    }
}
