package Lesson16Homework.Task19;

public class DevelopiaEmployee {
    String name;
    int experience;
    String city;
    double baseSalary = 1500;

    DevelopiaEmployee(String name, int experience, String city) {
        this.name = name;
        this.experience = experience;
        this.city = city;
    }

    double calculateSalary() {
        int bonus = (experience > 5) ? (experience - 5) * 100 : 0;
        int cityBonus = city.equalsIgnoreCase("Bakı") ? 200 : 0;
        return baseSalary + bonus + cityBonus;
    }

    public static void main(String[] args) {
        DevelopiaEmployee emp = new DevelopiaEmployee("Azər İsmayılov", 14, "Bakı");
        double total = emp.calculateSalary();
        System.out.println("Toplam maaş: " + total + " AZN");
    }
}
