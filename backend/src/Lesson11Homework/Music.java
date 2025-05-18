package Lesson11Homework;

public class Music {

        String title;
        String artist;
        double duration;
        int follower;

    public Music(String t, String a, double d, int f) {
            title = t;
            artist = a;
            duration = d;
            follower = f;
        }

        public void calculateFollowers() {
            follower += 100;
            System.out.println("Follower artirildi");
        }

        public String toString() {
            return "Music{title='" + title + "', artist='" + artist + "', duration=" + duration + ", follower=" + follower + "}";
        }

}
