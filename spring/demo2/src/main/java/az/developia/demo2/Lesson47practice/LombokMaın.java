package az.developia.demo2.Lesson47practice;

public class LombokMaın {
    public static void main(String[] args) {
        Person p = new Person("Elsen", "Memmedov", 25, 1500);
        Developer d = new Developer("Ali", "Aliyev", "Java Developer", 2500);
        Book b = new Book("Java Basics", "Beginner guide", 29.99, "John Doe");

        System.out.println("Person: " + p);
        System.out.println("Developer: " + d);
        System.out.println("Book: " + b);
        System.out.println("Book name and price: " + b.getNameAndPrice());
    }
}
