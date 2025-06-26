package Lesson21Homework.PdfTapsiriqlari.Tap5;

public class MainClass {

        public static void main(String[] args) {

            Circle circle = new Circle();
            circle.radius = 7.0;

            Calculator calculator = new Calculator();

            calculator.calculateCircleLength(circle);

            System.out.println("Dairənin uzunluğu: " + circle.length);
        }


}
