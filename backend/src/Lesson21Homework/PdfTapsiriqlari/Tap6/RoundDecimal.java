package Lesson21Homework.PdfTapsiriqlari.Tap6;

public class RoundDecimal {
    public static void main(String[] args) {
        double number = 5.678;
        double rounded = Math.round(number * 10.0) / 10.0;
        System.out.println(number + " → 10-da birlərə yuvarlaq: " + rounded);
    }
}
