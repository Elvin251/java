package Lesson38Homework;

interface Payable {
    void paySalary();
}

class Staff extends Employee implements Payable {
    Staff(String name, String jobTitle, double salary) {
        super(name, jobTitle, salary);
    }
    public void paySalary() {
        System.out.println(name + " has been paid $" + salary);
    }
}

 class Main17 {
    public static void main(String[] args) {
        Staff s = new Staff("Elsen","Manager",3000);
        s.paySalary();
    }
}
