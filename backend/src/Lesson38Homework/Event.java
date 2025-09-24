package Lesson38Homework;

class Event {
    String name, date, location;
    Event(String name, String date, String location) {
        this.name=name; this.date=date; this.location=location;
    }
    void show() { System.out.println(name + " at " + location + " on " + date); }
}

class Seminar extends Event {
    int speakers;
    Seminar(String name, String date, String location, int speakers) {
        super(name,date,location); this.speakers=speakers;
    }
    void show() { super.show(); System.out.println("Speakers: " + speakers); }
}

class MusicalPerformance extends Event {
    String performer;
    MusicalPerformance(String name, String date, String location, String performer) {
        super(name,date,location); this.performer=performer;
    }
    void show() { super.show(); System.out.println("Performer: " + performer); }
}

 class Main26 {
    public static void main(String[] args) {
        Seminar s = new Seminar("Tech Talk", "2025-10-01", "Hall A", 3);
        MusicalPerformance m = new MusicalPerformance("Rock Concert", "2025-10-02", "Arena", "Band X");
        s.show();
        m.show();
    }
}
