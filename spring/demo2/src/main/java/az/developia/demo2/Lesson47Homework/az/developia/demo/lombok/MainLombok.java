package az.developia.demo2.Lesson47Homework.az.developia.demo.lombok;



public class MainLombok {
    public static void main(String[] args) {
        Student student = new Student(1, "Ali", "Huseynov", 95.5);
        System.out.println(student);

        Car car = new Car("BMW", "X5", 2022, 85000);
        System.out.println(car);

        Movie movie = new Movie("Inception", "Sci-Fi", 148, 8.8);
        System.out.println(movie);
        System.out.println(movie.getTitleAndRating());
    }
}
