package Lesson10Homework;

public class Yoxlanis {
    public static void main(String[] args) {
        // Student obyekti
        Student student = new Student();
        student.name = "Leyla";
        student.surname = "Əliyeva";
        student.grade = 92.5;
        student.major = "İnformasiya Texnologiyaları";
        student.university = "ADNSU";

        // Person obyekti
        Person person = new Person();
        person.name = "Rəşad";
        person.surname = "Quliyev";
        person.gender = "Kişi";
        person.age = 28;

        // User obyekti
        User user = new User();
        user.username = "rashad123";
        user.email = "rashad@example.com";
        user.password = "securepass";

        // Movie obyekti
        Movie movie = new Movie();
        movie.title = "The Matrix";
        movie.director = "Wachowski Sisters";
        movie.category = "Sci-Fi";
        movie.year = 1999;

        // Music obyekti
        Music music = new Music();
        music.title = "Imagine";
        music.artist = "John Lennon";
        music.duration = 3.15;

//        Neticeler cap olunmasi
        System.out.println(student);
        System.out.println(person);
        System.out.println(user);
        System.out.println(movie);
        System.out.println(music);
    }
}
