package Lesson36Homework;

interface Playable {
    void play();
}

class Football implements Playable {
    public void play() { System.out.println("Playing football"); }
}

class Volleyball implements Playable {
    public void play() { System.out.println("Playing volleyball"); }
}

class Basketball implements Playable {
    public void play() { System.out.println("Playing basketball"); }
}

 class Main8 {
    public static void main(String[] args) {
        Playable[] sports = { new Football(), new Volleyball(), new Basketball() };
        for (Playable p : sports) p.play();
    }
}
