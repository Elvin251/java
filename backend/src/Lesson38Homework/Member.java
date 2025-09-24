package Lesson38Homework;
import java.util.ArrayList;
class Member {
    String name;
    Member(String name) { this.name = name; }
}

class Library2 {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Member> members = new ArrayList<>();

    void addBook(Book b) { books.add(b); }
    void registerMember(Member m) { members.add(m); }

    void showMembers() {
        for (Member m : members) System.out.println("Member: " + m.name);
    }
}

class Main11 {
    public static void main(String[] args) {
        Library2 lib = new Library2();
        lib.addBook(new Book("Java 101","John","111"));
        lib.registerMember(new Member("Elsen"));
        lib.showMembers();
    }
}
