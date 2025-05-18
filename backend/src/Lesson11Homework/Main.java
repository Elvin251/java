package Lesson11Homework;

public class Main {
    public static void main(String[] args) {

        // 1. Student sinifi
        Student student = new Student("Ali", "Hesenov", 70, "Computer Science", "BDU");
        student.calculateGrade();
        System.out.println(student.toString());

        System.out.println();

        // 2. Person sinifi
        Person person = new Person("Aysel", "Ismayilova", "Qadin", 20);
        person.calculateAge();
        System.out.println(person.toString());

        System.out.println();

        // 3. User sinifi
        User user = new User("user123", "user@example.com", "secret123");
        System.out.println(user.toString());

        System.out.println();

        // 4. Movie sinifi
        Movie movie = new Movie("Inception", "Christopher Nolan", "Sci-Fi", 2010);
        System.out.println(movie.toString());

        System.out.println();

        // 5. Music sinifi
        Music music = new Music("Shape of You", "Ed Sheeran", 4.24, 1000);
        music.calculateFollowers();
        System.out.println(music.toString());

    }
}
