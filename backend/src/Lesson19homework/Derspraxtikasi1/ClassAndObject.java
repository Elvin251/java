package Lesson19homework.Derspraxtikasi1;

public class ClassAndObject {
    public static void main(String[] args) {


        Book book1 = new Book();
        book1.id = 1;
        book1.name = "Səfillər";
        book1.author = "Victor Hugo";
        book1.pageCount = 1200;
        book1.description = "Ədalət və insanlıq haqqında klassik roman.";

        Book book2 = new Book();
        book2.id = 2;
        book2.name = "1984";
        book2.author = "George Orwell";
        book2.pageCount = 328;
        book2.description = "Totalitarizm və nəzarət cəmiyyətini tənqid edən əsər.";

        System.out.println("Book 1:");
        System.out.println("ID: " + book1.id);
        System.out.println("Name: " + book1.name);
        System.out.println("Author: " + book1.author);
        System.out.println("Page Count: " + book1.pageCount);
        System.out.println("Description: " + book1.description);

        System.out.println();

        System.out.println("Book 2:");
        System.out.println("ID: " + book2.id);
        System.out.println("Name: " + book2.name);
        System.out.println("Author: " + book2.author);
        System.out.println("Page Count: " + book2.pageCount);
        System.out.println("Description: " + book2.description);
    }
}

// Book sinifi
class Book {
    int id;
    String name;
    String author;
    int pageCount;
    String description;
}

