package Lesson35Practice;

abstract class Instrument {
    abstract void play();
    abstract void tune();
}

class Glockenspiel extends Instrument {
    void play() { System.out.println("Playing Glockenspiel."); }
    void tune() { System.out.println("Tuning Glockenspiel."); }
}

class Violin extends Instrument {
    void play() { System.out.println("Playing Violin."); }
    void tune() { System.out.println("Tuning Violin."); }
}
