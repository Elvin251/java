package Lesson36Homework;

interface Searchable {
    boolean search(String keyword);
}

class Document implements Searchable {
    String text;
    Document(String t) { text = t; }

    public boolean search(String keyword) {
        return text.contains(keyword);
    }
}

class WebPage implements Searchable {
    String html;
    WebPage(String h) { html = h; }

    public boolean search(String keyword) {
        return html.toLowerCase().contains(keyword.toLowerCase());
    }
}

 class Main9 {
    public static void main(String[] args) {
        Searchable doc = new Document("Java interfaces are powerful.");
        System.out.println(doc.search("Java")); // true
    }
}
