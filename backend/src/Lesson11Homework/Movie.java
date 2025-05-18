package Lesson11Homework;

public class Movie {
    String title;
    String director;
    String category;
    int year;

    public Movie(String t, String d, String c, int y) {
        title = t;
        director = d;
        category = c;
        year = y;
    }

    public String toString() {
        return "Movie{title='" + title + "', director='" + director + "', category='" + category + "', year=" + year + "}";
    }
}
