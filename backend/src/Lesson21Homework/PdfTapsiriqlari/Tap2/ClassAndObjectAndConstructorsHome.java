package Lesson21Homework.PdfTapsiriqlari.Tap2;
public class ClassAndObjectAndConstructorsHome {

    static class Employee {
        Integer id;
        String name;
        String surname;
        String phone;
        String address;
        int salary;

        public Employee() {
            System.out.println("Default constructor çağırıldı.");
        }

        public Employee(String name) {
            this.name = name;
            System.out.println("Name constructor çağırıldı: " + name);
        }

        public Employee(String name, String surname) {
            this.name = name;
            this.surname = surname;
            System.out.println("Name və Surname constructor çağırıldı: " + name + " " + surname);
        }

        public Employee(String name, String phone, int salary) {
            this.name = name;
            this.phone = phone;
            this.salary = salary;
            System.out.println("Name, Phone, Salary constructor çağırıldı: " + name + ", " + phone + ", " + salary);
        }
    }


    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.id = 1;
        emp1.name = "Aysel";
        emp1.surname = "Əliyeva";
        emp1.phone = "+994501112233";
        emp1.address = "Bakı";
        emp1.salary = 1000;

        Employee emp2 = new Employee("Rauf");
        emp2.id = 2;
        emp2.surname = "Məmmədov";
        emp2.phone = "+994552223344";
        emp2.address = "Sumqayıt";
        emp2.salary = 1200;


        Employee emp3 = new Employee("Lalə", "Hüseynova");
        emp3.id = 3;
        emp3.phone = "+994553334455";
        emp3.address = "Gəncə";
        emp3.salary = 950;


        Employee emp4 = new Employee("Elvin", "+994504445566", 1300);
        emp4.id = 4;
        emp4.surname = "Əsədov";
        emp4.address = "Şəki";

        System.out.println("\n--- Əməkdaş 1 ---");
        System.out.println("ID: " + emp1.id);
        System.out.println("Ad: " + emp1.name);
        System.out.println("Soyad: " + emp1.surname);
        System.out.println("Telefon: " + emp1.phone);
        System.out.println("Ünvan: " + emp1.address);
        System.out.println("Maaş: " + emp1.salary);

        System.out.println("\n--- Əməkdaş 2 ---");
        System.out.println("ID: " + emp2.id);
        System.out.println("Ad: " + emp2.name);
        System.out.println("Soyad: " + emp2.surname);
        System.out.println("Telefon: " + emp2.phone);
        System.out.println("Ünvan: " + emp2.address);
        System.out.println("Maaş: " + emp2.salary);

        System.out.println("\n--- Əməkdaş 3 ---");
        System.out.println("ID: " + emp3.id);
        System.out.println("Ad: " + emp3.name);
        System.out.println("Soyad: " + emp3.surname);
        System.out.println("Telefon: " + emp3.phone);
        System.out.println("Ünvan: " + emp3.address);
        System.out.println("Maaş: " + emp3.salary);

        System.out.println("\n--- Əməkdaş 4 ---");
        System.out.println("ID: " + emp4.id);
        System.out.println("Ad: " + emp4.name);
        System.out.println("Soyad: " + emp4.surname);
        System.out.println("Telefon: " + emp4.phone);
        System.out.println("Ünvan: " + emp4.address);
        System.out.println("Maaş: " + emp4.salary);
    }
}
