package Lesson35Homework;

class Employee3 {
    String name, address, jobTitle;
    double salary;

    Employee3(String name, String address, String jobTitle, double salary) {
        this.name = name;
        this.address = address;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public double calculateBonus() {
        return salary * 0.10;
    }

    public void performanceReport() {
        System.out.println(name + " (" + jobTitle + ") is performing well.");
    }
}

class Manager extends Employee3 {
    Manager(String n, String a, double s) {
        super(n, a, "Manager", s);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20;
    }

    public void manageProject() {
        System.out.println(name + " is managing a project.");
    }
}

class Developer extends Employee3 {
    Developer(String n, String a, double s) {
        super(n, a, "Developer", s);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15;
    }

    public void writeCode() {
        System.out.println(name + " is coding.");
    }
}

class Programmer extends Employee3 {
    Programmer(String n, String a, double s) {
        super(n, a, "Programmer", s);
    }

    public void debugCode() {
        System.out.println(name + " is debugging code.");
    }
}

 class Main10 {
    public static void main(String[] args) {
        Manager m = new Manager("Aysel", "Baku", 5000);
        Developer d = new Developer("Elvin", "Ganja", 4000);
        Programmer p = new Programmer("Samir", "Sumqayit", 3500);

        m.manageProject();
        d.writeCode();
        p.debugCode();

        System.out.println(m.name + " bonus: " + m.calculateBonus());
        System.out.println(d.name + " bonus: " + d.calculateBonus());
        System.out.println(p.name + " bonus: " + p.calculateBonus());
    }
}

