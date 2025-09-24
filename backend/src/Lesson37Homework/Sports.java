package Lesson37Homework;

class Sports {
    void play() {
        System.out.println("Playing sport");
    }
}

class Football extends Sports {
    @Override
    void play() {
        System.out.println("Playing Football");
    }
}

class Basketball extends Sports {
    @Override
    void play() {
        System.out.println("Playing Basketball");
    }
}

class Rugby extends Sports {
    @Override
    void play() {
        System.out.println("Playing Rugby");
    }
}

class Main5 {
    public static void main(String[] args) {
        Sports f = new Football();
        Sports b = new Basketball();
        Sports r = new Rugby();
        f.play();
        b.play();
        r.play();
    }
}
