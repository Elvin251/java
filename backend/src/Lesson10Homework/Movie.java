package Lesson10Homework;

public class Movie {
    String title;
    String director;
    String category;
    int year;

    @Override
    public String toString() {
        return "Movie{title='" + title + "', director='" + director +
                "', category='" + category + "', year=" + year + "}";
    }
}
