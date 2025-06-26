package Lesson21Homework.RiyaziMeseleler;

public class Task1 {
    public static void main(String[] args) {
        double distance = 25;
        double speed1 = 20;
        double speed2 = speed1 * 2.5;

        double totalSpeed = speed1 + speed2;
        double timeInHours = distance / totalSpeed;
        double timeInMinutes = timeInHours * 60;

        System.out.println("Qarşılaşma vaxtı: " + timeInMinutes + " dəqiqə");
    }
}
