package Lesson19homework.Derspraktikasi4;

public class MethodsReturn {
    public  static void main(String[] args) {

        Calculator calculator = new Calculator();

        double result1 = calculator.average(10, 20);
        System.out.println("Ədədi ortalama (10, 20): " + result1);

        double result2 = calculator.average(45, 75);
        System.out.println("Ədədi ortalama (45, 75): " + result2);
    }
}


class Calculator {

    public double average(int a, int b) {
        return (a + b) / 2.0;
    }
}
