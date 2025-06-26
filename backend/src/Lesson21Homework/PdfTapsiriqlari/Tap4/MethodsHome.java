package Lesson21Homework.PdfTapsiriqlari.Tap4;
public class MethodsHome {


    public void printNumbers(int begin, int end) {
        System.out.println("Ədədlər: " + begin + " - " + end);
        for (int i = begin; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // main metodu
    public static void main(String[] args) {

        MethodsHome mh = new MethodsHome();

        mh.printNumbers(1, 5);
        mh.printNumbers(10, 15);
        mh.printNumbers(20, 25);
    }
}
