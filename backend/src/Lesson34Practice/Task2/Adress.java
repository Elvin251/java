package Lesson34Practice.Task2;
class Address {
    String city;
    String address;

    Address(String city, String address) {
        this.city = city;
        this.address = address;
    }
}

class Person {
    String name;
    int age;
    Address address;

    Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void printInfo() {
        System.out.println("Ad: " + name + ", Yaş: " + age + ", Şəhər: " + address.city + ", Ünvan: " + address.address);
    }
}

class Developer extends Person {
    String job;
    double salary;

    Developer(String name, int age, Address address, String job, double salary) {
        super(name, age, address);
        this.job = job;
        this.salary = salary;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Peşə: " + job + ", Maaş: " + salary);
    }

    void changeName(String newName) {
        this.name = newName;
    }
}

